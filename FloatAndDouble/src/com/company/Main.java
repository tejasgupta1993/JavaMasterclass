package com.company;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = " + myMinFloatValue);
        System.out.println("Float Maximum Value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = " + myMinDoubleValue);
        System.out.println("Double Maximum Value = " + myMaxDoubleValue);

//        int myIntValue = 5;
        int myIntValue = 5 / 3;
//        float myFloatValue = 5.25f;
//        float myFloatValue = (float) 5.25;
//        double myDoubleValue = 5.25d;
//        float myFloatValue = 5f;
        float myFloatValue = 5f / 3f;
//        double myDoubleValue = 5d;
        double myDoubleValue = 5d / 3d;

        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDecimalValue = " + myDoubleValue);

//        converting pounds to kilograms

        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted Kilograms = " + convertedKilograms);
    }
}
