package org.asofe.blockexplorer.entity;

import java.io.Serializable;
import java.util.UUID;

public class TransactionVout implements Serializable {

    private static final long serialVersionUID = 235352837034549981L;

    private UUID id;

    private String txid;

    private Float value;

    private Integer valueZat;

    private Integer n;

    private scriptPubKey scriptPubKey;

    private String asm;

    private String hex;

    private Integer reqSigs;

    private String type;

    private String[] addresses;

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    public Integer getN() {
        return n;
    }

    public void setN(Integer n) {
        this.n = n;
    }

    public Integer getValueZat() {
        return valueZat;
    }

    public void setValueZat(Integer valueZat) {
        this.valueZat = valueZat;
    }

    public scriptPubKey getScriptPubKey() {
        return scriptPubKey;
    }

    public void setScriptPubKey(scriptPubKey scriptPubKey) {
        this.scriptPubKey = scriptPubKey;
    }

    public String getTxid() {
        return txid;
    }

    public void setTxid(String txid) {
        this.txid = txid;
    }

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

    public Integer getReqSigs() {
        return reqSigs;
    }

    public void setReqSigs(Integer reqSigs) {
        this.reqSigs = reqSigs;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String[] getAddresses() {
        return addresses;
    }

    public void setAddresses(String[] addresses) {
        this.addresses = addresses;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
