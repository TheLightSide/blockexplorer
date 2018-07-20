package org.asofe.blockexplorer.model.response;

public class AddressUTXOs {

    public AddressUTXOs() {}

    private String address;

    private String txid;

    private long height;

    private int outputIndex;

    private String scriptPubKey;

    private int satoshis;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTxid() {
        return txid;
    }

    public void setTxid(String txid) {
        this.txid = txid;
    }

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public int getOutputIndex() {
        return outputIndex;
    }

    public void setOutputIndex(int outputIndex) {
        this.outputIndex = outputIndex;
    }

    public int getSatoshis() {
        return satoshis;
    }

    public void setSatoshis(int satoshis) {
        this.satoshis = satoshis;
    }

    public String getScriptPubKey() {
        return scriptPubKey;
    }

    public void setScriptPubKey(String scriptPubKey) {
        this.scriptPubKey = scriptPubKey;
    }
}
