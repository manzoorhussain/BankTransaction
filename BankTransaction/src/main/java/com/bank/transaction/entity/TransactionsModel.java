package com.bank.transaction.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity

@Table(name = "transaction_info", schema = "transactions")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransactionsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BAT_ID")
    private Integer id;


    @Column(name="BAT_CURRENCY_TYPE")
    private String currency;


    @Column(name="BAT_AMOUNT")
    private Double amount;

    @Column(name="BAT_SOURCE_ACCOUNT")
    private String sourceAccountId;


}
