//package org.example.api.entities.requests;
//
//import org.example.api.entities.responses.WithStatus;
//
//import java.util.Map;
//
//public class AddRequestBody extends WithStatus {
//    private int isClub;
//    private Map<String, String> items;
//    private String store;
//    private String supplyAt;
//
//    public AddRequestBody(int statusCode, int isClub, Map<String, String> items, String store, String supplyAt) {
//        super(statusCode);
//        this.isClub = isClub;
//        this.items = items;
//        this.store = store;
//        this.supplyAt = supplyAt;
//    }
//
//    public AddRequestBody(int isClub, Map<String, String> items, String store, String supplyAt) {
//        this.isClub = isClub;
//        this.items = items;
//        this.store = store;
//        this.supplyAt = supplyAt;
//
//    }
//
//    public AddRequestBody() {
//    }
//
//    public AddRequestBody(Map<String, String> items) {
//        this.items = items;
//        this.isClub = 0;
//        this.store = "1197";
//        this.supplyAt = "2023-09-14T00:00:00.000Z";
//
//    }
//
//    public int getIsClub() {
//        return isClub;
//    }
//
//    public void setIsClub(int isClub) {
//        this.isClub = isClub;
//    }
//
//    public Map<String, String> getItems() {
//        return items;
//    }
//
//    public void setItems(Map<String, String> items) {
//        this.items = items;
//    }
//
//    public String getStore() {
//        return store;
//    }
//
//    public void setStore(String store) {
//        this.store = store;
//    }
//
//    public String getSupplyAt() {
//        return supplyAt;
//    }
//
//    public void setSupplyAt(String supplyAt) {
//        this.supplyAt = supplyAt;
//    }
//
//    @Override
//    public String toString() {
//        return "AddresponseBody{" +
//                "isClub=" + isClub +
//                ", items=" + items +
//                ", store='" + store + '\'' +
//                ", supplyAt='" + supplyAt + '\'' +
//                '}';
//    }
//}
