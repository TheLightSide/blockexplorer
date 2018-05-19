package org.asofe.blockexplorer.dao;

import org.asofe.blockexplorer.entity.Block;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.QueryHint;


public interface BlockRepository extends CrudRepository<Block, String> {

    public Block findByHeight(final String height);

    @Query(value = "SELECT b.height FROM block as b ORDER BY id DESC LIMIT 1", nativeQuery = true)
    public Integer getLatestHeight();

//    @Query("id:*?0* OR name:*?0*")
//    public Page<Block> findByCustomQuery(String searchTerm, Pageable pageable);
//
//    @Query(name = "Block.findByNamedQuery")
//    public Page<Block> findByNamedQuery(String searchTerm, Pageable pageable);
}
