package com.company;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("National Australia Bank");

       if(bank.addBranch("Adelaide")){
           System.out.println("Adelaide branch created");
       }

        bank.addCustomer("Adelaide", "Tejas", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 150.54);

        bank.addCustomerTransaction("Adelaide", "Tejas", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tejas", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Sydney", true);

        bank.addBranch("Melbourne");
        if(!bank.addCustomer("Melbourne", "Brian", 5.53)){
            System.out.println("Error Melbourne branch does not exist!");
        }

        if(!bank.addBranch("Adelaide")){
            System.out.println("Adelaide branch already exist");
        }

        if(!bank.addCustomerTransaction("Adelaide", "fergus", 52.33)){
            System.out.println("Customer does not exists");
        }

        if(!bank.addCustomer("Adelaide", "Tejas", 12.21)){
            System.out.println("Customer Tejas already exists");
        }

    }
}
