package org.example.api.entities.responses.AddToCartResponse;


import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemsData {

    @JsonProperty("countUsesSale")
    private CountUsesSale countUsesSale;
    @JsonProperty("FormatedSavePrice")
    private Integer formatedSavePrice;
    @JsonProperty("FormatedTotalPrice")
    private Double formatedTotalPrice;
    @JsonProperty("FormatedSavePriceClub")
    private Integer formatedSavePriceClub;
    @JsonProperty("FormatedSavePriceWallet")
    private Integer formatedSavePriceWallet;
    @JsonProperty("FormatedTotalPriceClub")
    private Double formatedTotalPriceClub;
    @JsonProperty("FormatedTotalPriceWallet")
    private Double formatedTotalPriceWallet;
    @JsonProperty("FormatedTotalPriceWithoutDiscount")
    private Double formatedTotalPriceWithoutDiscount;
    @JsonProperty("finalPriceClub")
    private Double finalPriceClub;
    @JsonProperty("finalPriceWallet")
    private Double finalPriceWallet;
    @JsonProperty("PromotionId")
    private Object promotionId;
    @JsonProperty("PromotionIdClub")
    private Object promotionIdClub;
    @JsonProperty("department_id")
    private Integer departmentId;
    @JsonProperty("group_id")
    private Integer groupId;
    @JsonProperty("site_id")
    private Integer siteId;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("price")
    private Double price;
    @JsonProperty("quantity")
    private Integer quantity;
    @JsonProperty("sub_group_id")
    private Integer subGroupId;
    @JsonProperty("has_coupon")
    private Boolean hasCoupon;
    @JsonProperty("is_delivery")
    private Boolean isDelivery;
    @JsonProperty("isClub")
    private Boolean isClub;
    @JsonProperty("isWallet")
    private Boolean isWallet;


    public ItemsData(CountUsesSale countUsesSale, Integer formatedSavePrice, Double formatedTotalPrice, Integer formatedSavePriceClub, Integer formatedSavePriceWallet, Double formatedTotalPriceClub, Double formatedTotalPriceWallet, Double formatedTotalPriceWithoutDiscount, Double finalPriceClub, Double finalPriceWallet, Object promotionId, Object promotionIdClub, Integer departmentId, Integer groupId, Integer siteId, Integer id, String name, Double price, Integer quantity, Integer subGroupId, Boolean hasCoupon, Boolean isDelivery, Boolean isClub, Boolean isWallet) {
        this.countUsesSale = countUsesSale;
        this.formatedSavePrice = formatedSavePrice;
        this.formatedTotalPrice = formatedTotalPrice;
        this.formatedSavePriceClub = formatedSavePriceClub;
        this.formatedSavePriceWallet = formatedSavePriceWallet;
        this.formatedTotalPriceClub = formatedTotalPriceClub;
        this.formatedTotalPriceWallet = formatedTotalPriceWallet;
        this.formatedTotalPriceWithoutDiscount = formatedTotalPriceWithoutDiscount;
        this.finalPriceClub = finalPriceClub;
        this.finalPriceWallet = finalPriceWallet;
        this.promotionId = promotionId;
        this.promotionIdClub = promotionIdClub;
        this.departmentId = departmentId;
        this.groupId = groupId;
        this.siteId = siteId;
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.subGroupId = subGroupId;
        this.hasCoupon = hasCoupon;
        this.isDelivery = isDelivery;
        this.isClub = isClub;
        this.isWallet = isWallet;
    }

    public ItemsData() {
    }

    public CountUsesSale getCountUsesSale() {
        return countUsesSale;
    }

    public void setCountUsesSale(CountUsesSale countUsesSale) {
        this.countUsesSale = countUsesSale;
    }

    public Integer getFormatedSavePrice() {
        return formatedSavePrice;
    }

    public void setFormatedSavePrice(Integer formatedSavePrice) {
        this.formatedSavePrice = formatedSavePrice;
    }

    public Double getFormatedTotalPrice() {
        return formatedTotalPrice;
    }

    public void setFormatedTotalPrice(Double formatedTotalPrice) {
        this.formatedTotalPrice = formatedTotalPrice;
    }

    public Integer getFormatedSavePriceClub() {
        return formatedSavePriceClub;
    }

    public void setFormatedSavePriceClub(Integer formatedSavePriceClub) {
        this.formatedSavePriceClub = formatedSavePriceClub;
    }

    public Integer getFormatedSavePriceWallet() {
        return formatedSavePriceWallet;
    }

    public void setFormatedSavePriceWallet(Integer formatedSavePriceWallet) {
        this.formatedSavePriceWallet = formatedSavePriceWallet;
    }

    public Double getFormatedTotalPriceClub() {
        return formatedTotalPriceClub;
    }

    public void setFormatedTotalPriceClub(Double formatedTotalPriceClub) {
        this.formatedTotalPriceClub = formatedTotalPriceClub;
    }

    public Double getFormatedTotalPriceWallet() {
        return formatedTotalPriceWallet;
    }

    public void setFormatedTotalPriceWallet(Double formatedTotalPriceWallet) {
        this.formatedTotalPriceWallet = formatedTotalPriceWallet;
    }

    public Double getFormatedTotalPriceWithoutDiscount() {
        return formatedTotalPriceWithoutDiscount;
    }

    public void setFormatedTotalPriceWithoutDiscount(Double formatedTotalPriceWithoutDiscount) {
        this.formatedTotalPriceWithoutDiscount = formatedTotalPriceWithoutDiscount;
    }

    public Double getFinalPriceClub() {
        return finalPriceClub;
    }

    public void setFinalPriceClub(Double finalPriceClub) {
        this.finalPriceClub = finalPriceClub;
    }

    public Double getFinalPriceWallet() {
        return finalPriceWallet;
    }

    public void setFinalPriceWallet(Double finalPriceWallet) {
        this.finalPriceWallet = finalPriceWallet;
    }

    public Object getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(Object promotionId) {
        this.promotionId = promotionId;
    }

    public Object getPromotionIdClub() {
        return promotionIdClub;
    }

    public void setPromotionIdClub(Object promotionIdClub) {
        this.promotionIdClub = promotionIdClub;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getSubGroupId() {
        return subGroupId;
    }

    public void setSubGroupId(Integer subGroupId) {
        this.subGroupId = subGroupId;
    }

    public Boolean getHasCoupon() {
        return hasCoupon;
    }

    public void setHasCoupon(Boolean hasCoupon) {
        this.hasCoupon = hasCoupon;
    }

    public Boolean getDelivery() {
        return isDelivery;
    }

    public void setDelivery(Boolean delivery) {
        isDelivery = delivery;
    }

    public Boolean getClub() {
        return isClub;
    }

    public void setClub(Boolean club) {
        isClub = club;
    }

    public Boolean getWallet() {
        return isWallet;
    }

    public void setWallet(Boolean wallet) {
        isWallet = wallet;
    }

    @Override
    public String toString() {
        return "ItemsData{" +
                "countUsesSale=" + countUsesSale +
                ", formatedSavePrice=" + formatedSavePrice +
                ", formatedTotalPrice=" + formatedTotalPrice +
                ", formatedSavePriceClub=" + formatedSavePriceClub +
                ", formatedSavePriceWallet=" + formatedSavePriceWallet +
                ", formatedTotalPriceClub=" + formatedTotalPriceClub +
                ", formatedTotalPriceWallet=" + formatedTotalPriceWallet +
                ", formatedTotalPriceWithoutDiscount=" + formatedTotalPriceWithoutDiscount +
                ", finalPriceClub=" + finalPriceClub +
                ", finalPriceWallet=" + finalPriceWallet +
                ", promotionId=" + promotionId +
                ", promotionIdClub=" + promotionIdClub +
                ", departmentId=" + departmentId +
                ", groupId=" + groupId +
                ", siteId=" + siteId +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", subGroupId=" + subGroupId +
                ", hasCoupon=" + hasCoupon +
                ", isDelivery=" + isDelivery +
                ", isClub=" + isClub +
                ", isWallet=" + isWallet +
                '}';
    }
}