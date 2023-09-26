package org.example.api.entities.requests;

import lombok.*;

import java.util.Map;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class AddRequestBody {
    private int isClub;
    private Map<String, String> items;
    private String store;
    private String supplyAt;

}