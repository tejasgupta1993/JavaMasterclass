package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sum of odd numbers from 1 to 9 is = " + sumOdd(1, 9));
        System.out.println(sumOdd(11, -99));
        System.out.println(sumOdd(-1, 99));
        System.out.println(sumOdd(-11, -99));
        System.out.println("Sum of odd numbers from 11 to 99 is = " + sumOdd(11, 99));


    }

    private static boolean isOdd(int number){
        if(number < 0){
            return false;
        }

        if((number % 2) == 1){
            return true;
        }

        return false;
    }

    private static int sumOdd(int start, int end){
        if((start < 0) || (end < 0) || (start > end)){
            return -1;
        }

        int sum = 0;
        for(int i = start; i <= end;i++){
            if(isOdd(i)){
                sum += i;
            }
        }
        return sum;
    }
}
