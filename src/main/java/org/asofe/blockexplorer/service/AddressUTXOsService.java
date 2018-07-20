package org.asofe.blockexplorer.service;

import org.asofe.blockexplorer.dao.AddressRepository;
import org.asofe.blockexplorer.entity.Address;
import org.asofe.blockexplorer.model.response.AddressUTXOs;
import org.asofe.blockexplorer.utils.Commands;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AddressUTXOsService {

    private static final Logger LOG = LoggerFactory.getLogger(MemPools.class);

    @Autowired
    AddressRepository addressRepository;

    public ArrayList<AddressUTXOs> getAddressUTXos(String[] address) {
        ArrayList<AddressUTXOs> result = new ArrayList<>();
        for (String addr: address) {
            Address[] foundAddr = addressRepository.getUnspentAddress(addr);
            for (Address fAddr: foundAddr) {
                AddressUTXOs addressUTXOs = new AddressUTXOs();
                addressUTXOs.setAddress(fAddr.getAddress());
                addressUTXOs.setHeight(fAddr.getHeight());
                addressUTXOs.setOutputIndex(fAddr.getN());
                addressUTXOs.setSatoshis(fAddr.getValue());
                addressUTXOs.setTxid(fAddr.getTxid());
                addressUTXOs.setScriptPubKey(fAddr.getHex());
                result.add(addressUTXOs);
            }
        }

        return result;
    }
}
