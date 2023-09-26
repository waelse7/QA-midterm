package org.example.api.entities.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class LoginRequestBody {
    @JsonProperty("id_delivery_times")
    private String idDeliveryTimes;
    @JsonProperty("username")
    private String username;
    @JsonProperty("password")
    private String password;
    @JsonProperty("restore_account")
    private boolean restoreAccount;
}

