package org.example.api.entities.responses.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class SubGroup {
    @JsonProperty("name")
    public String name;
    @JsonProperty("id")
    public int id;
    @JsonProperty("sort")
    public int sort;
    @JsonProperty("slug")
    public String slug;
}
