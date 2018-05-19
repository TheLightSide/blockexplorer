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

    @Column(name = "value", columnDefinition="bigint")
    private int value;

    @Column(name = "vin", columnDefinition="smallint")
    private int vin;

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
}
