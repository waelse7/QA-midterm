package org.example.api.entities.responses.add;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.example.api.entities.responses.WithStatus;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class AddResponseBody extends WithStatus {
    @JsonProperty("sales")
    public List<Sale> sales;
    @JsonProperty("items")
    public List<Item> items;
    @JsonProperty("log_id")
    public Object logId;
    @JsonProperty("price")
    public double price;
    @JsonProperty("priceClub")
    public double priceClub;
    @JsonProperty("discountClub")
    public int discountClub;
    @JsonProperty("priceWallet")
    public double priceWallet;
    @JsonProperty("discountWallet")
    public int discountWallet;
    @JsonProperty("discount")
    public int discount;
    @JsonProperty("quantity")
    public int quantity;
    @JsonProperty("meta")
    public Meta meta;
    @JsonProperty("status")
    public int status;

}
