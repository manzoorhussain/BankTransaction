package com.bank.transaction.services;

import com.bank.transaction.constants.Constants;
import com.bank.transaction.entity.TransactionsModel;
import com.bank.transaction.repository.BankTransactionRepo;
import com.bank.transaction.request.TransactionRequest;
import com.bank.transaction.response.ApiResponse;
import com.bank.transaction.response.TransactionResponse;
import com.bank.transaction.transformers.RequestTransformer;
import com.bank.transaction.transformers.ResponseTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankTransactionService {

    @Autowired
    private BankTransactionRepo bankTransactionRepo;

    @Autowired
    private RequestTransformer requestTransformer;

    @Autowired
    private ResponseTransformer responseTransformer;

    public ApiResponse createTransaction(TransactionRequest request) {
        TransactionsModel transactionsModel = requestTransformer.transactionsRequest(request);
        TransactionsModel dbModel = bankTransactionRepo.save(transactionsModel);
        TransactionResponse transactionResponse = responseTransformer.transactionsResponse(dbModel);

        ApiResponse response = new ApiResponse(Constants.SUCCESS_CODE,Constants.SAVE_MESSAGE,transactionResponse);
        return response;
    }

}
