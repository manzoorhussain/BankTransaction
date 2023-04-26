package com.bank.transaction.transformers;

import com.bank.transaction.entity.TransactionsModel;
import com.bank.transaction.request.TransactionRequest;
import org.springframework.stereotype.Component;

@Component
public class RequestTransformer {

    public TransactionsModel transactionsRequest(TransactionRequest request){

        TransactionsModel model=new TransactionsModel();
        model.setAmount(request.getAmount());
        model.setCurrency(request.getCurrency());
        model.setSourceAccountId(request.getSourceAccountId());

        return model;

    }

}
