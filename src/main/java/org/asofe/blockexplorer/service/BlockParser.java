package org.asofe.blockexplorer.service;

import org.asofe.blockexplorer.dao.BlockDao;
import org.asofe.blockexplorer.entity.Block;
import org.asofe.blockexplorer.utils.Commands;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BlockParser {

    private Block block;

    @Autowired
    private Commands commands;

    @Autowired
    BlockDao blockDao;

    public void execute(Block block) {
        this.block = block;
        blockDao.saveBlock(block);
    }

}
