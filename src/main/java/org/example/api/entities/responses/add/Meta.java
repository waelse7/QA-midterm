package org.example.api.entities.responses.add;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Meta {
    @JsonProperty("ct")
    public int ct;
    @JsonProperty("ms")
    public double ms;
    @JsonProperty("cs")
    public int cs;
}
