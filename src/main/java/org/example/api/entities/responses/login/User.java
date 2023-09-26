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
public class User {
    @JsonProperty("id")
    public int id;
    @JsonProperty("first_name")
    public String firstName;
    @JsonProperty("last_name")
    public String lastName;
    @JsonProperty("email")
    public String email;
    @JsonProperty("token")
    public String token;
    @JsonProperty("user_id")
    public String userId;
    @JsonProperty("meta")
    public Object meta;
    @JsonProperty("store_id")
    public String storeId;
    @JsonProperty("locale")
    public Object locale;
    @JsonProperty("identity_card")
    public String identityCard;
    @JsonProperty("accounting_card_id")
    public Object accountingCardId;
    @JsonProperty("business")
    public int business;
    @JsonProperty("birth_date")
    public Object birthDate;
    @JsonProperty("phone")
    public Object phone;
    @JsonProperty("additional_phone")
    public Object additionalPhone;
    @JsonProperty("sex_id")
    public Object sexId;
    @JsonProperty("edit_order")
    public Object editOrder;
    @JsonProperty("send_email")
    public int sendEmail;
    @JsonProperty("send_sms")
    public int sendSms;
    @JsonProperty("subscribe_at")
    public String subscribeAt;
    @JsonProperty("subscribe_ip")
    public String subscribeIp;
    @JsonProperty("club_accept_at")
    public String clubAcceptAt;
    @JsonProperty("club_accept_ip")
    public String clubAcceptIp;
    @JsonProperty("club_accept")
    public int clubAccept;
    @JsonProperty("send_club_database")
    public int sendClubDatabase;
    @JsonProperty("disabled_at")
    public Object disabledAt;
    @JsonProperty("activated_at")
    public Object activatedAt;
    @JsonProperty("deleted_at")
    public Object deletedAt;
    @JsonProperty("area_id")
    public int areaId;
    @JsonProperty("deactivated_at")
    public Object deactivatedAt;
    @JsonProperty("customer_id_club")
    public Object customerIdClub;
    @JsonProperty("name")
    public String name;
    @JsonProperty("orders")
    public List<Object> orders;
    @JsonProperty("cards")
    public List<Object> cards;
    @JsonProperty("addresses")
    public List<Object> addresses;
    @JsonProperty("popularProducts")
    public String popularProducts;
    @JsonProperty("features")
    public List<Object> features;
    @JsonProperty("coupons")
    public List<Object> coupons;
}
