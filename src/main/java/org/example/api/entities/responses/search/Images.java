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
public class Images {
    @JsonProperty("small")
    public String small;
    @JsonProperty("original")
    public String original;
    @JsonProperty("trim")
    public String trim;
    @JsonProperty("transparent")
    public Object transparent;
    @JsonProperty("gallery")
    public List<Object> gallery;
}
