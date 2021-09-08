package com.digital.bank.service;

import com.digital.bank.entity.Account;
import com.digital.bank.entity.Customer;
import com.digital.bank.entity.RetailCustomer;
import com.digital.bank.entity.SavingsAccount;
import com.digital.bank.exceptions.DigitalBankException;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CustomerServiceImplTest {

    private CustomerService customerService;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        customerService = new CustomerServiceImpl();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }


    @Test
    void findCustomer(){
        BigDecimal johnBvn = new BigDecimal(1000160401L);
        Customer ise = null;
        try {
            ise = customerService.findCustomer(johnBvn.longValue());
        } catch (DigitalBankException e) {
            e.printStackTrace();
        }
        assertNotNull(ise);
    }

    @Test
    void findCustomerWithInvalidBVN(){
        assertThrows(DigitalBankException.class,
                ()-> customerService.findCustomer(1202920010));
    }

    @Test
    void openAccountWithNullCustomer(){
        assertThrows(DigitalBankException.class,
                ()-> customerService.openAccount(null, new SavingsAccount(BigDecimal.valueOf(10000))));
    }

    @Test
    void openAccountWithNullAccount(){
        Customer john = new RetailCustomer("John", "Johnson");
        assertThrows(DigitalBankException.class,
                ()-> customerService.openAccount(john, null));
    }

    @Test
    void openAccount(){
        BigDecimal johnBvn = new BigDecimal(1000160401L);
        Customer ise = null;
        try {
            ise = customerService.findCustomer(johnBvn.longValue());
        } catch (DigitalBankException e) {
            e.printStackTrace();
        }
        assertNotNull(ise);

//        Account iseSavings()
    }
}