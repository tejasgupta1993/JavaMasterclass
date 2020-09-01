package com.company;

public class ComplexOperations {

    private double real, imaginary;

    public ComplexOperations(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void add(ComplexOperations number) {
        this.real += number.getReal();
        this.imaginary += number.getImaginary();
    }

    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    public void subtract(ComplexOperations number) {
        this.real -= number.getReal();
        this.imaginary -= number.getImaginary();
    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

}
