package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
        System.out.println(hasSameLastDigit(19, 99, 999));
        System.out.println(hasSameLastDigit(47, 17, 997));


    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3){
        if((number1 < 10) || (number1 > 1000) || (number2 < 10) || (number2 > 1000)
                        || (number3 < 10) || (number3 > 1000)){
            return false;
        }
        // for any two number having same last digit
//        return (((number1 % 10) == (number2 % 10)) || ((number2 % 10) == (number3 % 10))
//                    || ((number3 % 10) == (number1 % 10)));


        // for all three numbers having same last digit
        return (((number1 % 10) == (number2 % 10)) && ((number2 % 10) == (number3 % 10))
                    && ((number3 % 10) == (number1 % 10)));


    }
}
