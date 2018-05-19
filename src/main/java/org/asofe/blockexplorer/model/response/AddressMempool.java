package org.asofe.blockexplorer.model.response;

import java.util.HashSet;

public class AddressMempool {

    public AddressMempool() {}

    private HashSet<String> addressTxids;

    private float totalBalance;

    public HashSet<String> getAddressTxids() {
        return addressTxids;
    }

    public void setAddressTxids(HashSet<String> addressTxids) {
        this.addressTxids = addressTxids;
    }

    public float getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(float totalBalance) {
        this.totalBalance = totalBalance;
    }
}
