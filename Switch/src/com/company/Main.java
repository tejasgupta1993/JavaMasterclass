package com.company;

public class Main {

    public static void main(String[] args) {
//	    int value = 1;
//	    if(value == 1){
//            System.out.println("Value was 1");
//        }else if(value == 2){
//            System.out.println("value was 2");
//        }else{
//            System.out.println("Was not 1 0r 2");
//        }

	    int switchValue = 6;
	    switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:case 4: case 5:
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4 or 5");
                break;
        }
        // More cade here


        char charValue = 'A';
	    switch (charValue){
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("Character is = " + charValue);
                break;
            default:
                System.out.println("Character not found");
                break;
        }

//        String month = "JANUARy";
        String month = "JUne";
	    switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
                break;
        }
    }
}
