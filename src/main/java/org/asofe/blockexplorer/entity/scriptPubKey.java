package org.asofe.blockexplorer.entity;

import java.io.Serializable;

public class scriptPubKey implements Serializable {

    private String asm;

    private String hex;

    private Integer reqSigs;

    private String type;

    private String[] addresses;

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
}
