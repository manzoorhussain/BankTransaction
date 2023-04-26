package com.bank.transaction.response;

import lombok.*;

import java.io.Serializable;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ApiResponse implements Serializable {
    private String code;
    private String message;
    private Object response;
}
