package com.company;

public class Main {

    public static void main(String[] args) {

//        BankAccount bobsAccount = new BankAccount("12345", 0, "Bob Brown",
//                    "myemail@gmail.com","(087) 123-4567" );

//        BankAccount bobsAccount = new BankAccount();
//
//        System.out.println(bobsAccount.getAccountNumber());
//        System.out.println(bobsAccount.getBalance());
//        bobsAccount.setAccountNumber("12345");
//        bobsAccount.setBalance(0);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setEmail("myemail@gmail.com");
//        bobsAccount.setPhoneNumber("(087) 123-4567");

//        bobsAccount.withdrawal(100);
//
//        bobsAccount.deposit(50);
//        bobsAccount.withdrawal(100);
//
//        bobsAccount.deposit(51);
//        bobsAccount.withdrawal(100);
//
        BankAccount tejasAccount = new BankAccount("Tejas",
                        "tejas@email.com", "12345");
        System.out.println(tejasAccount.getAccountNumber());
        System.out.println(tejasAccount.getCustomerName());
        System.out.println("Current balance is " + tejasAccount.getBalance());
        tejasAccount.withdrawal(100.55);

//        VipCustomer customer1 = new VipCustomer();
//        System.out.println(customer1.getName());
//
//        VipCustomer customer2 = new VipCustomer("Bob", 25000);
//        System.out.println(customer2.getName());
//
//        VipCustomer customer3 = new VipCustomer("Tejas", 100,"tejas@gmail.com");
//        System.out.println(customer3.getName());
//        System.out.println(customer3.getEmailAddress());
    }
}
