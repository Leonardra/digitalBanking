package com.digital.bank.entity;

import com.digital.bank.repo.CustomerRepo;

public class RetailCustomer extends Customer{

    public RetailCustomer(String firstName, String lastName) {
        setBvn(CustomerRepo.generateBVN());
        setFirstName(firstName);
        setLastName(lastName);
    }
    public RetailCustomer(long bvn, String firstName, String lastName) {
        this(firstName, lastName);
        setBvn(bvn);
    }

    public RetailCustomer(Long bvn, String firstName, String lastName, String email) {
        this(bvn, firstName, lastName);
        setEmail(email);
    }
}
