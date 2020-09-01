package com.company;

public class Rectangle {

    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.breadth = 0;
        this.length = 0;
        if ((length > 0) || (breadth > 0)) {
            this.length = length;
            this.breadth = breadth;
        }
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public double getArea(){
        return (double) Math.round(this.length * this.breadth * 100) / 100;
    }
}
