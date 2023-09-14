package org.example.api.entities.responses.AddToCartResponse;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.example.api.entities.responses.WithStatus;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class AddResponseBody extends WithStatus {

    @JsonProperty("sales")
    private List<Object> sales;
    @JsonProperty("items")
    private List<ItemsData> items;
    @JsonProperty("log_id")
    private Object logId;
    @JsonProperty("price")
    private Double price;
    @JsonProperty("priceClub")
    private Double priceClub;
    @JsonProperty("discountClub")
    private Integer discountClub;
    @JsonProperty("priceWallet")
    private Double priceWallet;
    @JsonProperty("discountWallet")
    private Integer discountWallet;
    @JsonProperty("discount")
    private Integer discount;
    @JsonProperty("quantity")
    private Integer quantity;
    @JsonProperty("meta")
    private Meta meta;
    @JsonProperty("status")
    private Integer status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();


    public AddResponseBody(List<Object> sales, List<ItemsData> items, Object logId, Double price, Double priceClub, Integer discountClub, Double priceWallet, Integer discountWallet, Integer discount, Integer quantity, Meta meta, Integer status, Map<String, Object> additionalProperties) {
        this.sales = sales;
        this.items = items;
        this.logId = logId;
        this.price = price;
        this.priceClub = priceClub;
        this.discountClub = discountClub;
        this.priceWallet = priceWallet;
        this.discountWallet = discountWallet;
        this.discount = discount;
        this.quantity = quantity;
        this.meta = meta;
        this.status = status;
        this.additionalProperties = additionalProperties;
    }

    public AddResponseBody(List<Object> sales) {
        this.sales = sales;
    }

    public AddResponseBody() {
    }

    public List<Object> getSales() {
        return sales;
    }

    public void setSales(List<Object> sales) {
        this.sales = sales;
    }

    public List<ItemsData> getItems() {
        return items;
    }

    public void setItems(List<ItemsData> items) {
        this.items = items;
    }

    public Object getLogId() {
        return logId;
    }

    public void setLogId(Object logId) {
        this.logId = logId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPriceClub() {
        return priceClub;
    }

    public void setPriceClub(Double priceClub) {
        this.priceClub = priceClub;
    }

    public Integer getDiscountClub() {
        return discountClub;
    }

    public void setDiscountClub(Integer discountClub) {
        this.discountClub = discountClub;
    }

    public Double getPriceWallet() {
        return priceWallet;
    }

    public void setPriceWallet(Double priceWallet) {
        this.priceWallet = priceWallet;
    }

    public Integer getDiscountWallet() {
        return discountWallet;
    }

    public void setDiscountWallet(Integer discountWallet) {
        this.discountWallet = discountWallet;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    @Override
    public String toString() {
        return "AddResponseBody{" +
                "sales=" + sales +
                ", items=" + items +
                ", logId=" + logId +
                ", price=" + price +
                ", priceClub=" + priceClub +
                ", discountClub=" + discountClub +
                ", priceWallet=" + priceWallet +
                ", discountWallet=" + discountWallet +
                ", discount=" + discount +
                ", quantity=" + quantity +
                ", meta=" + meta +
                ", status=" + status +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}