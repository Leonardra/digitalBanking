package com.digital.bank.repo;

import com.digital.bank.entity.Customer;
import com.digital.bank.entity.RetailCustomer;

import java.util.HashMap;
import java.util.Map;

public class CustomerRepo {
    private static Map<Long, Customer> customers = new HashMap<>();
    private static long currentBVN = 1000160400;
    private static long currentAccountNumber = Long.valueOf(0);
    private static long currentTransactionId = Long.valueOf(0);


    static{
        Customer ise = new RetailCustomer("Iseoluwa", "Fasoyin");
        addCustomer(ise);
        Customer kelvin = new RetailCustomer("Kelvin", "Okoro");
        addCustomer(kelvin);
        Customer anjous = new RetailCustomer("Anjola", "Azeez");
        addCustomer(anjous);
    }

    public static void addCustomer(Customer customer) {
        customers.put(customer.getBvn(), customer);
    }

    public static Map<Long, Customer> getCustomers() {
        return customers;
    }

    public static long generateBVN(){
        currentBVN++;
        return currentBVN;
    }

    public static long generateTransactionId(){
        currentTransactionId++;
        return currentTransactionId;
    }

    public static long generateAccountNumber(){
        currentAccountNumber++;
        return currentAccountNumber;
    }

    private static void setCustomers(Map<Long, Customer> customers) {
        CustomerRepo.customers = customers;
    }
}
