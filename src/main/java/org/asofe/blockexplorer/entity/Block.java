package org.asofe.blockexplorer.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "block")
public class Block implements Serializable {

    private static final long serialVersionUID = 2353528370345499815L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "height")
    private int height;

    @Column(name = "hash", columnDefinition="character varying", length = 64)
    private String hash;

    @Column(name = "confirmations")
    private int confirmations;

    @Column(name = "size")
    private int size;

    @Column(name = "version")
    private int version;

    @Column(name = "merkleroot", columnDefinition="character varying", length = 64)
    private String merkleroot;

    @Transient
    private String[] tx;

    @Column(name = "time")
    private int time;

    @Column(name = "nonce", columnDefinition="character varying")
    private String nonce;

    @Column(name = "bits", columnDefinition="character varying")
    private String bits;

    @Column(name = "difficulty", columnDefinition="numeric")
    private float difficulty;

    @Column(name = "previousblockhash", columnDefinition="character varying", length = 64)
    private String previousblockhash;

    @Column(name = "nextblockhash", columnDefinition="character varying", length = 64)
    private String nextblockhash;

    @Column(name = "solution", columnDefinition="text")
    private String solution;

    @Column(name = "chainwork", columnDefinition="character varying")
    private String chainwork;

    @Column(name = "anchor", columnDefinition="character varying")
    private String anchor;

    @Transient
    private ValuePool[] ValuePools;

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public int getConfirmations() {
        return confirmations;
    }

    public void setConfirmations(int confirmations) {
        this.confirmations = confirmations;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getMerkleroot() {
        return merkleroot;
    }

    public void setMerkleroot(String merkleroot) {
        this.merkleroot = merkleroot;
    }

    public String[] getTx() {
        return tx;
    }

    public void setTx(String[] tx) {
        this.tx = tx;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getNonce() {
        return nonce;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    public String getBits() {
        return bits;
    }

    public void setBits(String bits) {
        this.bits = bits;
    }

    public float getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(float difficulty) {
        this.difficulty = difficulty;
    }

    public String getPreviousblockhash() {
        return previousblockhash;
    }

    public void setPreviousblockhash(String previousblockhash) {
        this.previousblockhash = previousblockhash;
    }

    public String getNextblockhash() {
        return nextblockhash;
    }

    public void setNextblockhash(String nextblockhash) {
        this.nextblockhash = nextblockhash;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public String getChainwork() {
        return chainwork;
    }

    public void setChainwork(String chainwork) {
        this.chainwork = chainwork;
    }

    public String getAnchor() {
        return anchor;
    }

    public void setAnchor(String anchor) {
        this.anchor = anchor;
    }

    public ValuePool[] getValuePools() {
        return ValuePools;
    }

    public void setValuePools(ValuePool[] ValuePools) {
        this.ValuePools = ValuePools;
    }
}
