package org.asofe.blockexplorer.dao;

import org.asofe.blockexplorer.entity.Address;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, String> {

//    @Query("select a from Address a where txid = ?1 AND n = ?2 AND vin = 0")
    Address findAddressByTxidAndNAndVin(String tx, int n, int vin);

    @Query("select a from Address a where address = ?1 AND spent = 0 AND vin = 0 AND vin_height = 0")
    Address[] getUnspentAddress(String addr);

}
