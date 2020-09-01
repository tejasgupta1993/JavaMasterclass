package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        int[] sortedArray = sortIntegers(myIntegers);
        printArray(sortedArray);

    }

    public static int[] getIntegers(int capacity){
        System.out.println("Enter " + capacity + " integer values!\r");
        int[] values = new int[capacity];
        for(int i = 0; i< values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array){
        for (int i = 0; i< array.length; i++){
            System.out.println("Element #" + (i+1) + " = " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
//        System.out.println("***** Sorted Array *****");
//        int[] sorted = new int[array.length];
//        for(int i = 0; i < array.length; i++){
//            sorted[i] = array[i];
//        }
        int[] sorted = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;

        while (flag){
            flag = false;
            for(int i = 0; i< sorted.length-1; i++){
                if(sorted[i] < sorted[i+1]){
                    temp = sorted[i];
                    sorted[i] = sorted[i+1];
                    sorted[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sorted;
    }
}
