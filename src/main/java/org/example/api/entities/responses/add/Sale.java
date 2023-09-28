package org.example.api.entities.responses.add;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Sale {
    @JsonProperty("code")
    public int code;
    @JsonProperty("sw_kefel")
    public int swKefel;
    @JsonProperty("k_cmt")
    public Object kCmt;
    @JsonProperty("k_acz_dis")
    public Object kAczDis;
    @JsonProperty("active")
    public int active;
    @JsonProperty("cmt")
    public int cmt;
    @JsonProperty("type")
    public int type;
    @JsonProperty("is_wallet")
    public int isWallet;
    @JsonProperty("is_personal")
    public int isPersonal;
    @JsonProperty("name")
    public String name;
    @JsonProperty("k_scm")
    public Object kScm;
    @JsonProperty("days")
    public List<Object> days;
    @JsonProperty("k_items")
    public List<Object> kItems;
    @JsonProperty("from")
    public String from;
    @JsonProperty("id")
    public int id;
    @JsonProperty("to")
    public String to;
    @JsonProperty("scm")
    public int scm;
    @JsonProperty("is_club")
    public int isClub;
    @JsonProperty("countInEveryDivided")
    public int countInEveryDivided;
}
