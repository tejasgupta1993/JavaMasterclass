package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(25,15));
        System.out.println(getGreatestCommonDivisor(12,30));
        System.out.println(getGreatestCommonDivisor(9,18));
        System.out.println(getGreatestCommonDivisor(81,153));
        System.out.println(getGreatestCommonDivisor(18,13));
        System.out.println(getGreatestCommonDivisor(81,23));
        System.out.println(getGreatestCommonDivisor(81, 81));

    }

    public static int getGreatestCommonDivisor(int number1, int number2){
        if((number1 < 10) || (number2 < 10)){
            return -1;
        }

        int divisor = 0;
        for(int i = 1; i <= Math.max(number1, number2); i++){
            if(((number1 % i) == 0) && ((number2 % i) == 0)){
                divisor = i;
            }
        }

        return divisor;
    }
}
