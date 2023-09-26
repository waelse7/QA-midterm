package org.example.api.entities.responses.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Department__1 {

    @JsonProperty("id")
    public int id;
    @JsonProperty("count")
    public int count;
}
