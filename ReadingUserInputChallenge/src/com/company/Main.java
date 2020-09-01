package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

//        while(true){
        while (counter < 10){
            int order = counter+1;
            System.out.println("Enter number #" + order + ":");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt) {
                sum += scanner.nextInt();
                counter++;
//                if (counter == 10) {
//                    break;
//                }
            }else{
                System.out.println("Invalid value!!");
            }
            scanner.nextLine();     // handle end of line (enter key)
        }
        System.out.println("Sum = " + sum);

        scanner.close();

    }
}
