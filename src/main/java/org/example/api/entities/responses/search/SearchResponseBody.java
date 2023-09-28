package org.example.api.entities.responses.search;

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
public class SearchResponseBody extends WithStatus {
    @JsonProperty("history")
    public List<Object> history;
    @JsonProperty("q")
    public String q;
    @JsonProperty("status")
    public int status;
    @JsonProperty("total")
    public int total;
    @JsonProperty("data")
    public List<Datum> data;
    @JsonProperty("filters")
    public Filters filters;
}
