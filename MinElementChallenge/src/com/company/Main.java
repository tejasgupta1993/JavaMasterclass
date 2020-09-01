package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter count:.\r");
        int count = scanner.nextInt();
        scanner.nextLine();
        int[] array = readIntegers(count);
        System.out.println("Smallest value = " + findMin(array));

    }

    private static int[] readIntegers(int count){
        int[] array = new int[count];
        System.out.println("Enter " + count + " elements");
        for(int i = 0; i < array.length; i++){
            System.out.println("Enter number #" + (i + 1));
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return array;
    }

    private static int findMin(int[] array){
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++){
            if(smallest > array[i]){
                smallest = array[i];
            }
        }
        return smallest;
    }
}
