package org.asofe.blockexplorer.utils;

import org.asofe.blockexplorer.entity.Block;
import org.asofe.blockexplorer.entity.Info;
import org.asofe.blockexplorer.entity.Transaction;
import org.asofe.blockexplorer.entity.TxOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("CoomandsService")
public class Commands {

    @Autowired
    private RpcDaemon rpcDaemon;

    public int getBlockHeight() throws Throwable {
        Info info = (Info) rpcDaemon.execute("getinfo", new Object[]{}, Info.class);
        return info.getBlocks();
    }

    public Block getBlock(int height) throws Throwable {
        return (Block) rpcDaemon.execute("getblock", new Object[]{Integer.toString(height)}, Block.class);
    }

    public Transaction getRawTransaction(String tx_id) throws Throwable {
        return (Transaction) rpcDaemon.execute("getrawtransaction", new Object[]{tx_id, 1}, Transaction.class);
    }

    public String[] getRawMempool() throws Throwable {
        return (String[]) rpcDaemon.execute("getrawmempool", new Object[]{}, String[].class);
    }

    public TxOut getTxOut(String tx_id) throws Throwable {
        return (TxOut) rpcDaemon.execute("gettxout", new Object[]{tx_id, 1}, TxOut.class);
    }

}
