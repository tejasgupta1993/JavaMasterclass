package com.company;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(50, true);
        System.out.println("initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted +
                " new total print count for printer = " + printer.getPagesPrinted());
        System.out.println("initial page count = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted +
                " new total print count for printer = " + printer.getPagesPrinted());

        System.out.println("*****Non-Duplex*****");

        Printer printer1 = new Printer(50, false);
        System.out.println("initial page count = " + printer1.getPagesPrinted());
        int pagesPrinted1 = printer1.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted1 +
                " new total print count for printer = " + printer1.getPagesPrinted());
        System.out.println("initial page count = " + printer1.getPagesPrinted());
        pagesPrinted1 = printer1.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted1 +
                " new total print count for printer = " + printer1.getPagesPrinted());
    }
}
