package com.digital.bank.service;

import com.digital.bank.entity.Account;
import com.digital.bank.entity.Customer;
import com.digital.bank.exceptions.DigitalBankException;
import com.digital.bank.repo.CustomerRepo;

public class CustomerServiceImpl implements CustomerService {

    @Override
    public Customer findCustomer(long bvn) throws DigitalBankException {
        Customer foundCustomer = CustomerRepo.getCustomers().get(bvn);
        if(foundCustomer == null){
            throw new DigitalBankException("Customer not found!");
        }
        return foundCustomer;
    }

    @Override
    public Customer openAccount(Customer customer, Account account) throws DigitalBankException {
        if(customer == null || account == null){
            throw new DigitalBankException("You need a customer and account details to open a new account");
        }
        return null;
    }
}
