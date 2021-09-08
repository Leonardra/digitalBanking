package com.digital.bank.entity;

public abstract class Customer {
    private Long bvn;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Account savingsAccount;
    private Account currentAccount;

    public void setBvn(long bvn) {
        this.bvn = bvn;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public long getBvn() {
        return bvn;
    }
}
