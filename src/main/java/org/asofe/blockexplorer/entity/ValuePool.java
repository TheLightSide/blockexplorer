package org.asofe.blockexplorer.entity;

import java.io.Serializable;

public class ValuePool implements Serializable {
    private static final long serialVersionUID = 2353528370345499815L;

    private String id;

    private boolean monitored;

    private float chainValue;

    private int chainValueZat;

    private float valueDelta;

    private int valueDeltaZat;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isMonitored() {
        return monitored;
    }

    public void setMonitored(boolean monitored) {
        this.monitored = monitored;
    }

    public float getChainValue() {
        return chainValue;
    }

    public void setChainValue(float chainValue) {
        this.chainValue = chainValue;
    }

    public int getChainValueZat() {
        return chainValueZat;
    }

    public void setChainValueZat(int chainValueZat) {
        this.chainValueZat = chainValueZat;
    }

    public float getValueDelta() {
        return valueDelta;
    }

    public void setValueDelta(float valueDelta) {
        this.valueDelta = valueDelta;
    }

    public int getValueDeltaZat() {
        return valueDeltaZat;
    }

    public void setValueDeltaZat(int valueDeltaZat) {
        this.valueDeltaZat = valueDeltaZat;
    }
}
