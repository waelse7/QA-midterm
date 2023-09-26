package org.example.api.entities.responses;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class WithStatus {
    protected int statusCode;

}
