package com.company;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = 0;
        if (radius > 0) {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){

//        Math.round() called to round of the area to 2 decimals only!!
        return (double) Math.round(Math.pow(radius, 2) * Math.PI * 100) / 100;
    }

}
