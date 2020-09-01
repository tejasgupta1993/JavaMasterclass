package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        inputThenPrintSunAndAverage();
    }

    public static void inputThenPrintSunAndAverage(){

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int average = 0;
        int count= 0;

        while(true){
            System.out.println("Enter number: ");
            boolean isInt = scanner.hasNextInt();

            if(isInt){
                sum += scanner.nextInt();
                count++;
            }else{
                System.out.println("Invalid value!!");
                break;
            }

            scanner.nextLine();
        }
        average = (int) Math.round(((double)sum)/count);

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

        scanner.close();
    }
}
