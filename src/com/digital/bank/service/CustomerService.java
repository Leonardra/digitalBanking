package com.digital.bank.service;

import com.digital.bank.entity.Account;
import com.digital.bank.entity.Customer;
import com.digital.bank.exceptions.DigitalBankException;

public interface CustomerService {
    Customer findCustomer(long bvn) throws DigitalBankException;
    Customer openAccount(Customer customer, Account account) throws DigitalBankException;
}
