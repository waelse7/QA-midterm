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
public class Filters {
    @JsonProperty("Cooking_Israel")
    public List<Object> cookingIsrael;
    @JsonProperty("Board_of_Supervision")
    public List<Object> boardOfSupervision;
    @JsonProperty("Allergen_Type_Code_and_Containment")
    public List<Object> allergenTypeCodeAndContainment;
    @JsonProperty("Kosher_Supervision_Type")
    public List<Object> kosherSupervisionType;
    @JsonProperty("Diet_Information")
    public List<Object> dietInformation;
    @JsonProperty("Rabbinate")
    public List<Object> rabbinate;
    @JsonProperty("Kosher_for_Passover")
    public List<Object> kosherForPassover;
    @JsonProperty("max_price")
    public List<Object> maxPrice;
    @JsonProperty("min_price")
    public List<Object> minPrice;
    @JsonProperty("Sabbath_Observing_Plant")
    public List<Object> sabbathObservingPlant;
    @JsonProperty("subGroups")
    public List<Object> subGroups;
    @JsonProperty("Israel_Milk")
    public List<Object> israelMilk;
    @JsonProperty("Sheviit_Orlah_Tevel")
    public List<Object> sheviitOrlahTevel;
    @JsonProperty("department")
    public List<Department__1> department;
    @JsonProperty("brand")
    public List<Brand> brand;
    @JsonProperty("is360")
    public List<Is360> is360;
}
