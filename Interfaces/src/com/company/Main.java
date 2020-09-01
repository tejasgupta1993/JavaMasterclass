package com.company;

public class Main {

    public static void main(String[] args) {

//        DeskPhone tejasPhone;
        ITelephone tejasPhone;
        tejasPhone = new DeskPhone(123456);
        tejasPhone.powerOn();
        tejasPhone.callPhone(123456);
        tejasPhone.answer();

        tejasPhone = new MobilePhone(24565);
        tejasPhone.powerOn();
        tejasPhone.callPhone(24565);
        tejasPhone.answer();

    }
}
