package com.digital.bank.service;

import com.digital.bank.entity.Account;
import com.digital.bank.entity.SavingsAccount;
import com.digital.bank.entity.Transaction;
import com.digital.bank.enums.TransactionType;
import com.digital.bank.exceptions.TransactionException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TransactionServiceImplTest {

    private TransactionService transactionService;
    @BeforeEach
    void setUp() {
        transactionService = new TransactionServiceImpl();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addCreditTransaction(){
        Account john = new SavingsAccount(BigDecimal.valueOf(10000));
        assertEquals(10000, john.getAccountBalance().intValue());
        Transaction initialDeposit = new Transaction(BigDecimal.valueOf(5000), TransactionType.CREDIT);
        try {
            BigDecimal newBalance = transactionService.addTransaction(john, initialDeposit);
            assertEquals(newBalance, john.getAccountBalance());
        } catch (TransactionException e) {
            e.printStackTrace();
        }
    }
}