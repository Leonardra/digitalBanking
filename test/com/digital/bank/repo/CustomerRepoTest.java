package com.digital.bank.repo;

import com.digital.bank.entity.Customer;
import com.digital.bank.entity.RetailCustomer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerRepoTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addCustomer(){
        assertTrue(CustomerRepo.getCustomers().isEmpty());
        Customer customer = new RetailCustomer("Oluwatobi", "Jolayemi");
        CustomerRepo.addCustomer(customer);
        assertFalse(CustomerRepo.getCustomers().isEmpty());
        assertEquals(1, CustomerRepo.getCustomers().size());
    }
}