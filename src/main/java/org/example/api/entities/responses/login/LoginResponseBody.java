package org.example.api.entities.responses.login;

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
public class LoginResponseBody extends WithStatus {
    @JsonProperty("user")
    public User user;
    @JsonProperty("deliveryTimesCustomer")
    public Object deliveryTimesCustomer;
    @JsonProperty("orderTokens")
    public List<Object> orderTokens;
    @JsonProperty("order")
    public Object order;
    @JsonProperty("cart")
    public Cart cart;
    @JsonProperty("shopLists")
    public List<Object> shopLists;
}
