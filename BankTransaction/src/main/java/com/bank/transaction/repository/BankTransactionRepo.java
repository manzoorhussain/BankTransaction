package com.bank.transaction.repository;

import com.bank.transaction.entity.TransactionsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankTransactionRepo extends JpaRepository<TransactionsModel,Integer> {
}
