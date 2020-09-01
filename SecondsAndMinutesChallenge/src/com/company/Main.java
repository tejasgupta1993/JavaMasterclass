package com.company;

public class Main {

    // constant
    private static final String INVALID_VALUE_MESSAGE = "Invalid value!";

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65, 9));
    }

    private static String getDurationString(int minutes, int seconds) {

        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        String hoursString = hours + "h";
        if(hours < 10){
            hoursString = "0" + hoursString;
        }

        String minutesString = remainingMinutes + "m";
        if(remainingMinutes < 10){
            minutesString = "0" + minutesString;
        }

        String secondsString = seconds + "s";
        if(seconds < 10){
            secondsString = "0" + secondsString;
        }

//        in java there is a method called "Join" to do this
        return hoursString + " " + minutesString + " " + secondsString;
    }

    private static String getDurationString(int seconds) {

        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);

    }
}