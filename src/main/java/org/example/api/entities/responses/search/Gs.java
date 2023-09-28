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
public class Gs {
    @JsonProperty("Ingredient_Sequence_and_Name")
    public String ingredientSequenceAndName;
    @JsonProperty("Product_Dimensions")
    public Object productDimensions;
    @JsonProperty("Contains_Sulfur_Dioxide")
    public Object containsSulfurDioxide;
    @JsonProperty("Alcohol_Percentage_in_Product")
    public Object alcoholPercentageInProduct;
    @JsonProperty("BrandName")
    public String brandName;
    @JsonProperty("Product_Description_English")
    public String productDescriptionEnglish;
    @JsonProperty("Country_of_Origin")
    public Object countryOfOrigin;
    @JsonProperty("Fat_Percentage_in_Product")
    public Object fatPercentageInProduct;
    @JsonProperty("Allergen_Type_Code_and_Containment_May_Contain")
    public List<Object> allergenTypeCodeAndContainmentMayContain;
    @JsonProperty("pH")
    public Object pH;
    @JsonProperty("Serving_Size_Description")
    public String servingSizeDescription;
    @JsonProperty("litzman")
    public String litzman;
    @JsonProperty("Food_Symbol_Red")
    public Object foodSymbolRed;
    @JsonProperty("Allergen_Type_Code_and_Containment")
    public List<Object> allergenTypeCodeAndContainment;
    @JsonProperty("Color_Number")
    public Object colorNumber;
    @JsonProperty("Search_Tags")
    public List<String> searchTags;
    @JsonProperty("internal_product_description")
    public String internalProductDescription;
    @JsonProperty("Color")
    public Object color;
    @JsonProperty("Diet_Information")
    public List<Object> dietInformation;
    @JsonProperty("Nutritional_Values")
    public List<Object> nutritionalValues;
    @JsonProperty("Fruit_Percentage_in_Product")
    public Object fruitPercentageInProduct;
    @JsonProperty("Serving_Suggestion")
    public String servingSuggestion;
    @JsonProperty("Forbidden_Under_the_Age_of_18")
    public Object forbiddenUnderTheAgeOf18;
    @JsonProperty("name")
    public String name;
    @JsonProperty("Hazard_Precautionary_Statement")
    public String hazardPrecautionaryStatement;
    @JsonProperty("short_name")
    public String shortName;
    @JsonProperty("Consumer_Storage_Instructions")
    public String consumerStorageInstructions;
    @JsonProperty("Net_Content")
    public Object netContent;
    @JsonProperty("Healthy_Product")
    public String healthyProduct;
    @JsonProperty("Cream_Percentage_in_Product")
    public Object creamPercentageInProduct;
}
