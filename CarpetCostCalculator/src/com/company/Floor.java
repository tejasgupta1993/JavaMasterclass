package com.company;

public class Floor {

    private double width, height;

    public  Floor(double width, double height){
        this.width = width < 0? 0: width;
        this.height = height < 0? 0: height;
    }

    public double getArea(){
        return this.width * this.height;
    }
}
