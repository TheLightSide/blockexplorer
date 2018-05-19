package org.asofe.blockexplorer.dao.impl;

import org.asofe.blockexplorer.dao.AddressDao;
import org.asofe.blockexplorer.dao.AddressRepository;
import org.asofe.blockexplorer.entity.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AddressDaoImpl implements AddressDao {

    @Autowired
    AddressRepository addressRepository;

    @Override
    public void saveAddress(Address address) {
        addressRepository.save(address);
    }

}
