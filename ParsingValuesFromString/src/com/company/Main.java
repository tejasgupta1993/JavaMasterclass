package com.company;

public class Main {

    public static void main(String[] args) {

//        String numberAsString = "2018";
        String numberAsString = "2018.125";

        System.out.println("Number as String = " + numberAsString);

//        int number = Integer.parseInt(numberAsString);
//        System.out.println("Number = " + number);
//
//        numberAsString += 1;
//        number += 1;
//        System.out.println("Number as String = " + numberAsString);
//        System.out.println("Number = " + number);

        double num = Double.parseDouble(numberAsString);
        System.out.println("Number = " + num);

        numberAsString += 1;
        num += 1;
        System.out.println("Number as String = " + numberAsString);
        System.out.println("Number = " + num);

    }
}
