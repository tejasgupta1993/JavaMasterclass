package com.company;

public class Main {

    public static void main(String[] args) {

        Account tejasAccount = new Account("Tejas");
        tejasAccount.deposit(1000);
        tejasAccount.withdraw(500);
        tejasAccount.withdraw(-200);
        tejasAccount.deposit(-20);
        tejasAccount.calculateBalance();
//        tejasAccount.balance = 50000;

        System.out.println("Balance on account is " + tejasAccount.getBalance());

    }
}
