package com.bank.transaction.controller;

import com.bank.transaction.request.TransactionRequest;
import com.bank.transaction.response.ApiResponse;
import com.bank.transaction.services.BankTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
@RequestMapping("/bank")
public class BankTransactionController {


    @Autowired
    private BankTransactionService bankTransactionService;


    @PostMapping(value = "/api/v1/create", consumes = "application/json", produces = "application/json")
    public ResponseEntity<ApiResponse> createUser(@RequestBody TransactionRequest request) {
        ApiResponse response =bankTransactionService.createTransaction(request);
        return new ResponseEntity(response,HttpStatus.CREATED);
    }


}
