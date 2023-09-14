package org.example.api.entities.responses.LoginResponse;

public class DeliveryTimesCustomer {
    private int id;
    private int customer_id;
    private Object order_id;
    private int strip_id;
    private Address address;
    private String hour;
    private String supply_date;
    private String supply_date_no_time;
    private String order_until_hour;
    private Object expires_at;
    private String name;
    private double price;
    private String area_id;
    private String store_id;
    private Object deleted_at;
    private String created_at;
    private String updated_at;

    public DeliveryTimesCustomer(int id, int customer_id, Object order_id, int strip_id, Address address, String hour, String supply_date, String supply_date_no_time, String order_until_hour, Object expires_at, String name, double price, String area_id, String store_id, Object deleted_at, String created_at, String updated_at) {
        this.id = id;
        this.customer_id = customer_id;
        this.order_id = order_id;
        this.strip_id = strip_id;
        this.address = address;
        this.hour = hour;
        this.supply_date = supply_date;
        this.supply_date_no_time = supply_date_no_time;
        this.order_until_hour = order_until_hour;
        this.expires_at = expires_at;
        this.name = name;
        this.price = price;
        this.area_id = area_id;
        this.store_id = store_id;
        this.deleted_at = deleted_at;
        this.created_at = created_at;
        this.updated_at = updated_at;

    }

    public DeliveryTimesCustomer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public Object getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Object order_id) {
        this.order_id = order_id;
    }

    public int getStrip_id() {
        return strip_id;
    }

    public void setStrip_id(int strip_id) {
        this.strip_id = strip_id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getSupply_date() {
        return supply_date;
    }

    public void setSupply_date(String supply_date) {
        this.supply_date = supply_date;
    }

    public String getSupply_date_no_time() {
        return supply_date_no_time;
    }

    public void setSupply_date_no_time(String supply_date_no_time) {
        this.supply_date_no_time = supply_date_no_time;
    }

    public String getOrder_until_hour() {
        return order_until_hour;
    }

    public void setOrder_until_hour(String order_until_hour) {
        this.order_until_hour = order_until_hour;
    }

    public Object getExpires_at() {
        return expires_at;
    }

    public void setExpires_at(Object expires_at) {
        this.expires_at = expires_at;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getArea_id() {
        return area_id;
    }

    public void setArea_id(String area_id) {
        this.area_id = area_id;
    }

    public String getStore_id() {
        return store_id;
    }

    public void setStore_id(String store_id) {
        this.store_id = store_id;
    }

    public Object getDeleted_at() {
        return deleted_at;
    }

    public void setDeleted_at(Object deleted_at) {
        this.deleted_at = deleted_at;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    @Override
    public String toString() {
        return "DeliveryTimesCustomer{" +
                "id=" + id +
                ", customer_id=" + customer_id +
                ", order_id=" + order_id +
                ", strip_id=" + strip_id +
                ", address=" + address +
                ", hour='" + hour + '\'' +
                ", supply_date='" + supply_date + '\'' +
                ", supply_date_no_time='" + supply_date_no_time + '\'' +
                ", order_until_hour='" + order_until_hour + '\'' +
                ", expires_at=" + expires_at +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", area_id='" + area_id + '\'' +
                ", store_id='" + store_id + '\'' +
                ", deleted_at=" + deleted_at +
                ", created_at='" + created_at + '\'' +
                ", updated_at='" + updated_at + '\'' +
                '}';
    }
}