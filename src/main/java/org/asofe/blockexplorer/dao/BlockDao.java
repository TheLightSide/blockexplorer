package org.asofe.blockexplorer.dao;

import org.asofe.blockexplorer.entity.Block;

public interface BlockDao {

    void saveBlock(Block block);

    Block findByBlockHeight(int height);
}
