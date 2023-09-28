package org.example.api.entities.requests;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class SearchRequestBody {
    private int aggs;
    private String q;
    private String store;

}
