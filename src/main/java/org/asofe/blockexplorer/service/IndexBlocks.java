package org.asofe.blockexplorer.service;

import org.asofe.blockexplorer.dao.AddressDao;
import org.asofe.blockexplorer.dao.BlockRepository;
import org.asofe.blockexplorer.entity.*;
import org.asofe.blockexplorer.utils.Commands;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndexBlocks {

    private static final Logger LOG = LoggerFactory.getLogger(IndexBlocks.class);

    @Autowired
    private Commands commands;

    @Autowired
    private BlockParser blockParser;

    @Autowired
    private BlockRepository blockRepository;

    @Autowired
    private AddressDao addressDao;

    public void startIndex() {
        try {
            Integer index = blockRepository.getLatestHeight();
            int lastIndexBlock = (index == null) ? 0 : index;
            int currentHeight = commands.getBlockHeight();
            if (currentHeight > lastIndexBlock) {
                for (int height = lastIndexBlock + 1; height <= currentHeight; height++) {
                    Block block = commands.getBlock(height);
                    blockParser.execute(block);
                    parseTransaction(block.getTx());
                    LOG.info("Parsed block# " + height);
                }
            }
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
    
    private void parseTransaction(String[] tx) throws Throwable {
        for (String tx_id: tx) {
            Transaction transaction = commands.getRawTransaction(tx_id);
            TransactionVin[] tr_vins = transaction.getVin();
            for (TransactionVin tr_vin: tr_vins) {
                if (tr_vin.getCoinbase() == null) {
                    String vin_tx_id = tr_vin.getTxid();
                    int vout = tr_vin.getVout();
                    Transaction transaction2 = commands.getRawTransaction(vin_tx_id);
                    TransactionVout tr2_vouts = transaction2.getVout()[vout];
                    int value = tr2_vouts.getValueZat();
                    Address address1 = new Address();
                    address1.setAddress(tr2_vouts.getScriptPubKey().getAddresses()[0]);
                    address1.setTxid(vin_tx_id);
                    address1.setVin(1);
                    address1.setValue(value);
                    addressDao.saveAddress(address1);
                }
            }

            parseTransactionVouts(transaction, tx_id);
        }
    }

    private void parseTransactionVouts(Transaction transaction, String tx_id) {
        TransactionVout[] tr_vouts = transaction.getVout();
        for (TransactionVout tr_vout: tr_vouts) {
            String[] addresses = tr_vout.getScriptPubKey().getAddresses();
            for (String address: addresses) {
                int value = tr_vout.getValueZat();
                Address address1 = new Address();
                address1.setAddress(address);
                address1.setTxid(tx_id);
                address1.setVin(0);
                address1.setValue(value);
                addressDao.saveAddress(address1);
            }
        }
    }
}
