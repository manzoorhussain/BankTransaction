package com.bank.transaction.response;

import lombok.*;

/*@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor*/
@Builder
@Data
public class TransactionResponse {

    private Integer id;
    private String currency;
    private Double amount;
    private String sourceAccountId;
}
