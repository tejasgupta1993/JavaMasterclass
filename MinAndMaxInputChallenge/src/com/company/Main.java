package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
//        int min = 0;
//        int max = 0;
//        int counter = 1;
//        boolean first = true;

        while (true) {
            System.out.println("Enter number: ");
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                int number = scanner.nextInt();
//                if(counter == 1){
//                    min = number;
//                    max = number;
//                    counter++;
//                }

//                if(first){
//                    min = number;
//                    max = number;
//                    first = false;
//                }

                if (number > max) {
                    max = number;
                }

                if (number < min) {
                    min = number;
                }

            } else {
                break;
            }
            scanner.nextLine();
        }

        System.out.println("Minimum number = " + min);
        System.out.println("Maximum number = " + max);

        scanner.close();

    }
}
