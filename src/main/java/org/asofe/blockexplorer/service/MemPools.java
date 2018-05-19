package org.asofe.blockexplorer.service;

import org.asofe.blockexplorer.entity.TxOut;
import org.asofe.blockexplorer.model.response.AddressMempool;
import org.asofe.blockexplorer.utils.Commands;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

@Service
public class MemPools {

    private static final Logger LOG = LoggerFactory.getLogger(MemPools.class);

    @Autowired
    private Commands commands;

    public AddressMempool getAddressMempool(String[] addresses) throws Throwable {
        String[] txids = commands.getRawMempool();
        Map<String, TxOut> txOuts = new HashMap<>();
        HashSet<String> addressTxids = new HashSet<>();
        Float totalBalance = (float) 0;
        AddressMempool result = new AddressMempool();

        for (String txid: txids) {
            txOuts.put(txid, commands.getTxOut(txid));
        }

        for (Map.Entry<String, TxOut> entry : txOuts.entrySet()) {
            for (String address: addresses) {
                if (Arrays.asList(entry.getValue().getScriptPubKey().getAddresses()).contains(address)) {
                    addressTxids.add(entry.getKey());
                    totalBalance += entry.getValue().getValue();
                }
            }
        }

        result.setAddressTxids(addressTxids);
        result.setTotalBalance(totalBalance);
        return result;

    }

}
