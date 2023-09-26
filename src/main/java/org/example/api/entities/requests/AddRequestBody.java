package org.example.api.entities.requests;

import java.util.Map;

public class AddRequestBody {
    private int isClub;
    private Map<String, String> items;
    private String store;
    private String supplyAt;

    public AddRequestBody(int isClub, Map<String, String> items, String store, String supplyAt) {
        this.isClub = isClub;
        this.items = items;
        this.store = store;
        this.supplyAt = supplyAt;
    }

    public AddRequestBody() {
    }

    public int getIsClub() {
        return isClub;
    }

    public void setIsClub(int isClub) {
        this.isClub = isClub;
    }

    public Map<String, String> getItems() {
        return items;
    }

    public void setItems(Map<String, String> items) {
        this.items = items;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getSupplyAt() {
        return supplyAt;
    }

    public void setSupplyAt(String supplyAt) {
        this.supplyAt = supplyAt;
    }

    @Override
    public String toString() {
        return "AddRequestBody{" +
                "isClub=" + isClub +
                ", items=" + items +
                ", store='" + store + '\'' +
                ", supplyAt='" + supplyAt + '\'' +
                '}';
    }
}