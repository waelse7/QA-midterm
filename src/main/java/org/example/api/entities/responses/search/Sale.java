package org.example.api.entities.responses.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

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
    @JsonProperty("deleted_by")
    public String deletedBy;
    @JsonProperty("k_acz_dis")
    public Object kAczDis;
    @JsonProperty("active")
    public int active;
    @JsonProperty("created_at")
    public String createdAt;
    @JsonProperty("cmt")
    public int cmt;
    @JsonProperty("label")
    public String label;
    @JsonProperty("type")
    public int type;
    @JsonProperty("is_wallet")
    public int isWallet;
    @JsonProperty("deleted_at")
    public Object deletedAt;
    @JsonProperty("is_personal")
    public int isPersonal;
    @JsonProperty("updated_at")
    public String updatedAt;
    @JsonProperty("approved_at")
    public Object approvedAt;
    @JsonProperty("name")
    public String name;
    @JsonProperty("k_scm")
    public Object kScm;
    @JsonProperty("from")
    public String from;
    @JsonProperty("id")
    public int id;
    @JsonProperty("to")
    public String to;
    @JsonProperty("scm")
    public int scm;
    @JsonProperty("pending_approval")
    public int pendingApproval;
    @JsonProperty("is_club")
    public int isClub;
    @JsonProperty("max_in_doc")
    public int maxInDoc;
}
