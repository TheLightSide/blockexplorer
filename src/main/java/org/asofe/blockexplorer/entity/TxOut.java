package org.asofe.blockexplorer.entity;

import java.io.Serializable;

public class TxOut implements Serializable {

    private static final long serialVersionUID = 235352837034549982L;

    private String bestblock;

    private int confirmations;

    private float value;

    private scriptPubKey scriptPubKey;

    private int version;

    private boolean coinbase;

    public String getBestblock() {
        return bestblock;
    }

    public void setBestblock(String bestblock) {
        this.bestblock = bestblock;
    }

    public int getConfirmations() {
        return confirmations;
    }

    public void setConfirmations(int confirmations) {
        this.confirmations = confirmations;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public org.asofe.blockexplorer.entity.scriptPubKey getScriptPubKey() {
        return scriptPubKey;
    }

    public void setScriptPubKey(org.asofe.blockexplorer.entity.scriptPubKey scriptPubKey) {
        this.scriptPubKey = scriptPubKey;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public boolean isCoinbase() {
        return coinbase;
    }

    public void setCoinbase(boolean coinbase) {
        this.coinbase = coinbase;
    }
}
