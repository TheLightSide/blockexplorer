package org.asofe.blockexplorer.entity;

import java.io.Serializable;

public class TransactionVin implements Serializable {
    private static final long serialVersionUID = 2353528370345499815L;

    private String txid;

    private int vout;

    private String coinbase;

    private Integer sequence;

    private scriptSig scriptSig;

    public String getTxid() {
        return txid;
    }

    public void setTxid(String txid) {
        this.txid = txid;
    }

    public int getVout() {
        return vout;
    }

    public void setVout(int vout) {
        this.vout = vout;
    }

    public String getCoinbase() {
        return coinbase;
    }

    public void setCoinbase(String coinbase) {
        this.coinbase = coinbase;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public scriptSig getScriptSig() {
        return scriptSig;
    }

    public void setScriptSig(scriptSig scriptSig) {
        this.scriptSig = scriptSig;
    }
}

class scriptSig {
    private String asm;

    private String hex;

    public String getAsm() {
        return asm;
    }

    public void setAsm(String asm) {
        this.asm = asm;
    }

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }
}