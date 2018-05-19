package org.asofe.blockexplorer.entity;

import java.io.Serializable;

public class Transaction implements Serializable {
    private static final long serialVersionUID = 235352837034549981L;

    private String hex;

    private String txid;

    private Integer version;

    private Integer locktime;

    private TransactionVin[] vin;

    private TransactionVout[] vout;

    private Vjoinsplit[] vjoinsplit;

    private String blockhash;

    private Integer confirmations;

    private String time;

    private String blocktime;

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }

    public String getTxid() {
        return txid;
    }

    public void setTxid(String txid) {
        this.txid = txid;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getLocktime() {
        return locktime;
    }

    public void setLocktime(Integer locktime) {
        this.locktime = locktime;
    }

    public TransactionVin[] getVin() {
        return vin;
    }

    public void setVin(TransactionVin[] vin) {
        this.vin = vin;
    }

    public TransactionVout[] getVout() {
        return vout;
    }

    public void setVout(TransactionVout[] vout) {
        this.vout = vout;
    }

    public Vjoinsplit[] getVjoinsplit() {
        return vjoinsplit;
    }

    public void setVjoinsplit(Vjoinsplit[] vjoinsplit) {
        this.vjoinsplit = vjoinsplit;
    }

    public String getBlockhash() {
        return blockhash;
    }

    public void setBlockhash(String blockhash) {
        this.blockhash = blockhash;
    }

    public Integer getConfirmations() {
        return confirmations;
    }

    public void setConfirmations(Integer confirmations) {
        this.confirmations = confirmations;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getBlocktime() {
        return blocktime;
    }

    public void setBlocktime(String blocktime) {
        this.blocktime = blocktime;
    }
}
