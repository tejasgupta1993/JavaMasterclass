package com.company;

public class Main {

    public static void main(String[] args) {

        byte byteValue = 10;
        short shortValue = 20;
        int intvalue = 50;

        long longTotal = 50000L + 10L * (byteValue + shortValue + intvalue);
        System.out.println(longTotal);
    }
}
