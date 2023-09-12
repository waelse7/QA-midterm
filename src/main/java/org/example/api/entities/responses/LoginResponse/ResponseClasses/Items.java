package org.example.api.entities.responses.LoginResponse.ResponseClasses;

import java.util.Map;

public class Items {
    private Map<String, Integer> items;

    public Map<String, Integer> getItems() {
        return items;
    }

    public void setItems(Map<String, Integer> items) {
        this.items = items;
    }

    public Items(Map<String, Integer> items) {
        this.items = items;
    }

    public Items() {
    }

    @Override
    public String toString() {
        return "Items{" +
                "items=" + items +
                '}';
    }
}

