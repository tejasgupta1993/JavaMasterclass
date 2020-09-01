package com.company;

public class Main {

    public static void main(String[] args) {

        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        String myString = "This is my string";
        System.out.println("My string is: " + myString);
        myString = myString + " and this is more!";
        System.out.println("My string is: " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("My string is: " + myString);
        // no addition will be done
        String numberString = "250.55";
        numberString = numberString + "49.45";
        System.out.println(numberString);

        // no clculation will be done
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to: " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to: " + lastString);

    }
}
