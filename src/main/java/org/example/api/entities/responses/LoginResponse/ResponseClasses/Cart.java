package org.example.api.entities.responses.LoginResponse.ResponseClasses;

public class Cart {
    private int uid;
    private String updated_at;
    private int last_update;
    private Items items;

    public Cart(int uid, String updated_at, int last_update, Items items) {
        this.uid = uid;
        this.updated_at = updated_at;
        this.last_update = last_update;
        this.items = items;
    }

    public Cart() {
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public int getLast_update() {
        return last_update;
    }

    public void setLast_update(int last_update) {
        this.last_update = last_update;
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "uid=" + uid +
                ", updated_at='" + updated_at + '\'' +
                ", last_update=" + last_update +
                ", items=" + items +
                '}';
    }
}