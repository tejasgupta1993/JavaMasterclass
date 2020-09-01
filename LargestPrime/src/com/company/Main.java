package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
        
    }

    public static int getLargestPrime(int number){
        if(number < 2){
            return -1;
        }


        int primeNumber = 2;
        while (number > 1){
            if(number % primeNumber == 0){
                number/=primeNumber;
            }else {
                primeNumber++;
            }
        }
        return primeNumber;
    }
}
