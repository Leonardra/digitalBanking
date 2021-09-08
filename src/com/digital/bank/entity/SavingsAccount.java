package com.digital.bank.entity;

import com.digital.bank.repo.CustomerRepo;

import java.math.BigDecimal;

public class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount(BigDecimal initialDeposit) {
        setAccountNumber(CustomerRepo.generateAccountNumber());
        setAccountBalance(initialDeposit);
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
