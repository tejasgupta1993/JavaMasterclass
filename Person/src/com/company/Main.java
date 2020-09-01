package com.company;

public class Main {

    public static void main(String[] args) {

        Person human = new Person();

        human.setFirstName("");
        System.out.println("First name is " + human.getFirstName());

        human.setLastName("");
        System.out.println("Last name is " + human.getLastName());

        human.setAge(10);
        System.out.println("Age is " + human.getAge());

        System.out.println("Full name =" + human.getFullName());
        System.out.println("Teen = " + human.isTeen());

        human.setFirstName("John");
        human.setAge(18);
        System.out.println("Full Name = " + human.getFullName());
        System.out.println("Teen = " + human.isTeen());

        human.setLastName("Smith");
        System.out.println("Full name = " +  human.getFullName());
    }
}
