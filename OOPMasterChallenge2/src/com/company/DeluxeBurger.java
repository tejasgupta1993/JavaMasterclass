package com.company;

public class DeluxeBurger extends Burger{

    private Addition chips;
    private Addition drink;

    public DeluxeBurger(String name, String bread, String meat, double price) {
        super(name, bread, meat, price);
        this.drink = new Addition("Drink", 5.2);
        this.chips = new Addition("Chips", 8.9);
        super.addIngredient(drink);
        super.addIngredient(chips);
    }

    @Override
    public void printExtraAdditions() {
        System.out.println("----------------EXTRA ADDITIONS-------------------");
        printAdditionPrice(1, this.drink);
        printAdditionPrice(2, this.chips);
    }

    @Override
    public void checkBill() {
        printExtraAdditions();
        super.checkBill();
    }
}
