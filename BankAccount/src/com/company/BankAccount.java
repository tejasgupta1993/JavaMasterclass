package com.company;

public class BankAccount {

    private String accountNumber, phoneNumber, customerName, email;
    private double balance;

    public BankAccount(){
        // this is calling another constructor in a constructor with these
        // default values
        // this needs to be very 1st line of constructor tobe executed
        this("56789", 2.50, "Default Name",
                "default address", "Default Number");
        System.out.println("Empty constructor is called");
    }

    public BankAccount(String accountNumber, double balance,
                            String customerName, String email, String phoneNumber){
        System.out.println("Constructor with parameters is called.");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber){
        this("99999", 100.55, customerName, email, phoneNumber);
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void deposit(double money){
        this.balance += money;
        System.out.println("Deposit of " + money + " made. New balance = " + this.balance);
    }

    public void withdrawal(double money){
        if(this.balance - money < 0){
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        }else {
            this.balance -= money;
            System.out.println("Withdrawal of " + money + " processed. Remaining balance = " + this.balance);
        }
    }
}
