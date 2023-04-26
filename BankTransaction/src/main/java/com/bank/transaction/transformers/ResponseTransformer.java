package com.bank.transaction.transformers;

import com.bank.transaction.entity.TransactionsModel;
import com.bank.transaction.response.TransactionResponse;
import org.springframework.stereotype.Component;

@Component
public class ResponseTransformer {


    public TransactionResponse transactionsResponse(TransactionsModel model) {

        TransactionResponse responseModel = TransactionResponse.builder()
                .id(model.getId())
                .amount(model.getAmount())
                .currency(model.getCurrency())
                .sourceAccountId(model.getSourceAccountId())
                .build();

        return responseModel;

    }
}
