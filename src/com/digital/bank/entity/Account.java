package com.digital.bank.entity;

import com.digital.bank.enums.TransactionType;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Account {
    private Long accountNumber;
    private BigDecimal accountBalance;
    private List<Transaction> transactions = new ArrayList<>();

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void addTransaction(Transaction transaction){
        if(transaction != null && transaction.getType().equals(TransactionType.CREDIT))
        transactions.add(transaction);
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }
}
