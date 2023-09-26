package org.example.api.entities.responses.login;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Cart {
    @JsonProperty("uid")
    public int uid;
    @JsonProperty("updated_at")
    public String updatedAt;
    @JsonProperty("last_update")
    public int lastUpdate;
    @JsonProperty("items")
    public List<Integer> items;
}
