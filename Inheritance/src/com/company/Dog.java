package com.company;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);   // "super"invokes constructor of parent class
        this.eyes = eyes;                             // remove brain and body from parameters of constructor and
        this.legs = legs;                             // arguments of super bcoz we know every dog has only 1
        this.tail = tail;                             // brain and body and put 1 in place of them !!
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();                //  super will call the eat() method of parent class
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        super.move(5);      // parent method call without super keyword is preferred bcoz you might
    }                             // want to override the method and by using super keyword with the method
                                  // it will call the parent method only and not the override one!!
    public void run(){
        System.out.println("Dog.run() called");
        move(10);           // will look for method in the self class if not find in it then will look
    }                             // at parent class for that method

    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called.");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
