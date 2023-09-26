package org.example.api.entities.responses.add;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Item {
    @JsonProperty("countUsesSale")
    public List<Integer> countUsesSale;
    @JsonProperty("FormatedSavePrice")
    public int formatedSavePrice;
    @JsonProperty("FormatedTotalPrice")
    public double formatedTotalPrice;
    @JsonProperty("FormatedSavePriceClub")
    public int formatedSavePriceClub;
    @JsonProperty("FormatedSavePriceWallet")
    public int formatedSavePriceWallet;
    @JsonProperty("FormatedTotalPriceClub")
    public double formatedTotalPriceClub;
    @JsonProperty("FormatedTotalPriceWallet")
    public double formatedTotalPriceWallet;
    @JsonProperty("FormatedTotalPriceWithoutDiscount")
    public double formatedTotalPriceWithoutDiscount;
    @JsonProperty("finalPriceClub")
    public double finalPriceClub;
    @JsonProperty("finalPriceWallet")
    public double finalPriceWallet;
    @JsonProperty("PromotionIdClub")
    public Object promotionIdClub;
    @JsonProperty("site_id")
    public int siteId;
    @JsonProperty("id")
    public int id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("price")
    public double price;
    @JsonProperty("quantity")
    public int quantity;
    @JsonProperty("has_coupon")
    public boolean hasCoupon;
    @JsonProperty("is_delivery")
    public boolean isDelivery;
    @JsonProperty("isClub")
    public boolean isClub;
    @JsonProperty("countUsesSaleWallet")
    public List<Integer> countUsesSaleWallet;
    @JsonProperty("PromotionId")
    public List<Integer> promotionId;
    @JsonProperty("department_id")
    public int departmentId;
    @JsonProperty("group_id")
    public int groupId;
    @JsonProperty("sub_group_id")
    public int subGroupId;
    @JsonProperty("isWallet")
    public boolean isWallet;
}
