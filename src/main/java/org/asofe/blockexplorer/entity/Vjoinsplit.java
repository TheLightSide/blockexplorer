package org.asofe.blockexplorer.entity;

import java.io.Serializable;

public class Vjoinsplit implements Serializable {

    private Float vpub_old;

    private Float vpub_new;

    private String anchor;

    private String[] nullifiers;

    private String[] commitments;

    private String onetimePubKey;

    private String randomSeed;

    private String[] macs;

    private String proof;

    private String[] ciphertexts;

    public Float getVpub_old() {
        return vpub_old;
    }

    public void setVpub_old(Float vpub_old) {
        this.vpub_old = vpub_old;
    }

    public Float getVpub_new() {
        return vpub_new;
    }

    public void setVpub_new(Float vpub_new) {
        this.vpub_new = vpub_new;
    }

    public String getAnchor() {
        return anchor;
    }

    public void setAnchor(String anchor) {
        this.anchor = anchor;
    }

    public String[] getNullifiers() {
        return nullifiers;
    }

    public void setNullifiers(String[] nullifiers) {
        this.nullifiers = nullifiers;
    }

    public String[] getCommitments() {
        return commitments;
    }

    public void setCommitments(String[] commitments) {
        this.commitments = commitments;
    }

    public String getOnetimePubKey() {
        return onetimePubKey;
    }

    public void setOnetimePubKey(String onetimePubKey) {
        this.onetimePubKey = onetimePubKey;
    }

    public String getRandomSeed() {
        return randomSeed;
    }

    public void setRandomSeed(String randomSeed) {
        this.randomSeed = randomSeed;
    }

    public String[] getMacs() {
        return macs;
    }

    public void setMacs(String[] macs) {
        this.macs = macs;
    }

    public String getProof() {
        return proof;
    }

    public void setProof(String proof) {
        this.proof = proof;
    }

    public String[] getCiphertexts() {
        return ciphertexts;
    }

    public void setCiphertexts(String[] ciphertexts) {
        this.ciphertexts = ciphertexts;
    }
}
