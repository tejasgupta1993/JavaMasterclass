package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        int[] array = {1, 2, 3, 4, 5};
        int[] array = {1, 5, 3, 7, 11, 9, 15};
        System.out.println("Original Array : " + Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed Array : " + Arrays.toString(array));
    }

//    private static void reverse(int[] array){
//        int[] copy = new int[array.length];
//        for (int i = 0; i< array.length; i++){
//            copy[i] = array[i];
//        }
//        int count = 0;
//        for(int i = array.length-1; i >= 0; i--){
//            if(count < array.length) {
//                array[count] = copy[i];
//                count++;
//            }
//        }
//    }

    private static void reverse(int[] array){

        int maxIndex = array.length-1;
        int halfLength = array.length/2;
        for (int i = 0; i < halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex- i];
            array[maxIndex - i] = temp;
        }
    }
}
