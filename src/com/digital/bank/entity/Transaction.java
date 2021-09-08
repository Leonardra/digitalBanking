package com.digital.bank.entity;

import com.digital.bank.enums.TransactionType;
import com.digital.bank.repo.CustomerRepo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction {
    private Long id;
    private LocalDateTime transactionDate;
    private BigDecimal amount;
    private TransactionType transactionType;

    public Transaction(BigDecimal amount, TransactionType type) {
        id=CustomerRepo.generateTransactionId();
        this.amount = amount;
        transactionDate = LocalDateTime.now();
        transactionType = type;
    }

    public TransactionType getType() {
        return transactionType;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
