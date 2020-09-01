package com.company;

public class Main {

    // big count = no. of big boxes of 5kg each  (BADA CONTAINER)
    // small count = capacity of the small box   (AATE KA PIPPA)
    // goal = total weight of flour to be taken  (KITNA AATA CHAHIYE)
    public static void main(String[] args) {

        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,12));
        System.out.println(canPack(-3,2,12));

    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if((bigCount < 0) || (smallCount < 0) || (goal < 0)){
            return false;
        }

        if(((bigCount * 5) + smallCount) >= goal){
            goal %= 5;
        }

        return (smallCount >= goal);
    }
}
