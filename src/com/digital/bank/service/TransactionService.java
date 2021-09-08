package com.digital.bank.service;

import com.digital.bank.entity.Account;
import com.digital.bank.entity.Transaction;
import com.digital.bank.exceptions.TransactionException;

import java.math.BigDecimal;

public interface TransactionService {
    BigDecimal addTransaction(Account account, Transaction tx) throws TransactionException;
}
