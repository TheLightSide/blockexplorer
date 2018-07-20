package org.asofe.blockexplorer.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "address")
public class Address implements Serializable {

    private static final long serialVersionUID = 2353528370345499816L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "address", columnDefinition="character varying", length = 64)
    private String address;

    @Column(name = "txid", columnDefinition="character varying", length = 64)
    private String txid;

    @Column(name = "txid_vin", columnDefinition="character varying", length = 64)
    private String txidVin;

    @Column(name = "value", columnDefinition="bigint")
    private int value;

    @Column(name = "vin", columnDefinition="smallint")
    private int vin;

    @Column(name = "spent", columnDefinition="smallint" )
    private int spent;

    @Column(name = "n")
    private int n;

    @Column(name = "height")
    private long height;

    @Column(name = "vin_height")
    private long vinHeight;

    @Column(name = "hex", columnDefinition="character varying", length = 64)
    private String hex;

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

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int isVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public int getSpent() {
        return spent;
    }

    public void setSpent(int spent) {
        this.spent = spent;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public String getTxidVin() {
        return txidVin;
    }

    public void setTxidVin(String txidVin) {
        this.txidVin = txidVin;
    }

    public long getVinHeight() {
        return vinHeight;
    }

    public void setVinHeight(long vinHeight) {
        this.vinHeight = vinHeight;
    }

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }
}
