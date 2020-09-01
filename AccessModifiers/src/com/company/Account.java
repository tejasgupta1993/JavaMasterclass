package com.company;

import java.util.ArrayList;

public class Account {

    private String accountName;
    private double balance = 0;
    private ArrayList<Double> transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            transactions.add(amount);
            this.balance += amount;
            System.out.println(amount + " deposited. Balance is now " + this.balance);
        }else{
            System.out.println("Can't deposit negative sums");
        }
    }

    public void withdraw(double amount){
        double withdrawal = -amount;
        if(withdrawal<0){
            this.transactions.add(withdrawal);
            this.balance += withdrawal;
            System.out.println(amount + " withdrawn. Balance is now " + this.balance);
        }else{
            System.out.println("Can't withdraw negative sums");
        }
    }

    public void calculateBalance(){
        this.balance = 0;
        for(double i: this.transactions){
            this.balance += i;
        }
        System.out.println("Calculated balance is: " + this.balance);
    }
}
