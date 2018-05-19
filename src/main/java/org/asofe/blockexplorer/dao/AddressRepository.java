package org.asofe.blockexplorer.dao;

import org.asofe.blockexplorer.entity.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, String> {

}
