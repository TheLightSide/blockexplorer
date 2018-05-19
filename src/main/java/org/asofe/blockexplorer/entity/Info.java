package org.asofe.blockexplorer.entity;

import java.io.Serializable;

public class Info implements Serializable {
    private static final long serialVersionUID = 2353528370345499815L;

    private int version;

    private int protocolversion;

    private int walletversion;

    private float balance;

    private int blocks;

    private int timeoffset;

    private int connections;

    private String proxy;

    private float difficulty;

    private boolean testnet;

    private int keypoololdest;

    private int keypoolsize;

    private float paytxfee;

    private float relayfee;

    private String errors;

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getProtocolversion() {
        return protocolversion;
    }

    public void setProtocolversion(int protocolversion) {
        this.protocolversion = protocolversion;
    }

    public int getWalletversion() {
        return walletversion;
    }

    public void setWalletversion(int walletversion) {
        this.walletversion = walletversion;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getBlocks() {
        return blocks;
    }

    public void setBlocks(int blocks) {
        this.blocks = blocks;
    }

    public int getTimeoffset() {
        return timeoffset;
    }

    public void setTimeoffset(int timeoffset) {
        this.timeoffset = timeoffset;
    }

    public int getConnections() {
        return connections;
    }

    public void setConnections(int connections) {
        this.connections = connections;
    }

    public String getProxy() {
        return proxy;
    }

    public void setProxy(String proxy) {
        this.proxy = proxy;
    }

    public float getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(float difficulty) {
        this.difficulty = difficulty;
    }

    public boolean isTestnet() {
        return testnet;
    }

    public void setTestnet(boolean testnet) {
        this.testnet = testnet;
    }

    public int getKeypoololdest() {
        return keypoololdest;
    }

    public void setKeypoololdest(int keypoololdest) {
        this.keypoololdest = keypoololdest;
    }

    public int getKeypoolsize() {
        return keypoolsize;
    }

    public void setKeypoolsize(int keypoolsize) {
        this.keypoolsize = keypoolsize;
    }

    public float getPaytxfee() {
        return paytxfee;
    }

    public void setPaytxfee(float paytxfee) {
        this.paytxfee = paytxfee;
    }

    public float getRelayfee() {
        return relayfee;
    }

    public void setRelayfee(float relayfee) {
        this.relayfee = relayfee;
    }

    public String getErrors() {
        return errors;
    }

    public void setErrors(String errors) {
        this.errors = errors;
    }
}
