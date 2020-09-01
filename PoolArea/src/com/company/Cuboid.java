package com.company;

public class Cuboid extends Rectangle{

    private double height;

    public Cuboid(double length, double breadth, double height) {
        super(length, breadth);
        this.height = (height > 0) ? height : 0;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return getArea() * this.height;
    }
}
