package org.example.api.entities.responses.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Prop {
    @JsonProperty("unit")
    public int unit;
    @JsonProperty("sw_shakil")
    public int swShakil;
    @JsonProperty("by_kilo")
    public int byKilo;
    @JsonProperty("by_kilo_content")
    public int byKiloContent;
    @JsonProperty("status")
    public int status;
}
