package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(23, 12));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(55, 15));
        System.out.println(hasSharedDigit(2, 42));
    }

    public static boolean hasSharedDigit(int number1, int number2){
        if((number1 < 10) || (number1 > 99) || (number2 < 10) || (number2 > 99)){
            return false;
        }

        // for searchin a number at same place in 2 different numbers
//        while ((number1 > 0) || (number2 > 0)){
//            if((number1 % 10) == (number2 % 10)){
//                return true;
//            }else{
//                number1 /= 10;
//                number2 /= 10;
//            }
//        }
//        return false;

        return (number1%10 == number2%10  || number1%10 == (number2/10)
                || number1/10 == number2%10  || number1/10 == (number2/10));

    }
}
