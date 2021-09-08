package com.digital.bank.service;

import com.digital.bank.entity.Account;
import com.digital.bank.entity.Transaction;
import com.digital.bank.enums.TransactionType;
import com.digital.bank.exceptions.TransactionException;

import java.math.BigDecimal;

public class TransactionServiceImpl implements TransactionService{


    @Override
    public BigDecimal addTransaction(Account acc, Transaction tx) throws TransactionException {
        BigDecimal newBalance = null;
        if(tx.getType().equals(TransactionType.CREDIT)){
            newBalance = acc.getAccountBalance().add(tx.getAmount());
            acc.setAccountBalance(newBalance);
        }
        return newBalance;
    }
}
