package org.example.api.entities.responses.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Datum {
    @JsonProperty("kosher_type")
    public Object kosherType;
    @JsonProperty("features")
    public List<Object> features;
    @JsonProperty("price")
    public Price price;
    @JsonProperty("prop")
    public Prop prop;
    @JsonProperty("id")
    public int id;
    @JsonProperty("multiplication")
    public int multiplication;
    @JsonProperty("department")
    public Department department;
    @JsonProperty("barcode")
    public long barcode;
    @JsonProperty("brand")
    public int brand;
    @JsonProperty("group")
    public Group group;
    @JsonProperty("images")
    public Images images;
    @JsonProperty("department_id")
    public int departmentId;
    @JsonProperty("subGroup")
    public SubGroup subGroup;
    @JsonProperty("preference")
    public List<Object> preference;
    @JsonProperty("kashruts")
    public List<Object> kashruts;
    @JsonProperty("available_in")
    public List<Integer> availableIn;
    @JsonProperty("gs")
    public Gs gs;
    @JsonProperty("sale")
    public List<Sale> sale;
    @JsonProperty("mainImage")
    public int mainImage;
    @JsonProperty("group_id")
    public int groupId;
    @JsonProperty("name")
    public String name;
    @JsonProperty("site_id")
    public int siteId;
    @JsonProperty("sub_group_id")
    public int subGroupId;
    @JsonProperty("lables")
    public List<Object> lables;
    @JsonProperty("is360")
    public int is360;
    @JsonProperty("hl")
    public Hl hl;
    @JsonProperty("has_coupon")
    public boolean hasCoupon;

}
