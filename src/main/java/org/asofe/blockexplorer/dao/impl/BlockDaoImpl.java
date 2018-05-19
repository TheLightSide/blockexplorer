package org.asofe.blockexplorer.dao.impl;

import org.asofe.blockexplorer.dao.BlockDao;
import org.asofe.blockexplorer.dao.BlockRepository;
import org.asofe.blockexplorer.entity.Block;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BlockDaoImpl implements BlockDao {

    @Autowired
    private BlockRepository blockRepository;

    @Override
    public void saveBlock(Block block) {
        blockRepository.save(block);
    }

    @Override
    public Block findByBlockHeight(int height) {
        return null;
    }
}
