public class SumOfFirstAndLastDigit {

    /* First And Last Digit Sum

---
** Please read this entire page before attempting to solve this coding exercise.  Additional help is available by watching the video mentioned at the bottom of the page **
---

Write a method named sumFirstAndLastDigit with one parameter of type int called number.

The method needs to find the first and last digit of the parameter number passed to the method, using a loop and return the sum of the first and last digit of that number.

If the number is negative then the method needs to return -1 to indicate an invalid value.

Example input/output

sumFirstAndLastDigit(252); should return 4, first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.

sumFirstAndLastDigit(257); should return 9, first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.

sumFirstAndLastDigit(0); should return 0, first digit and the last digit is 0, since we only have 1 digit, which gives us 0+0 and the sum is 0.

sumFirstAndLastDigit(5); should return 10, first digit and last digit is 5, since we only have 1 digit, which gives us 5+5 and the sum is 10.

sumFirstAndLastDigit(-10); should return -1, because the parameter is negative and needs to be positive. */

    public static void main(String[] args) {

        System.out.println("Sum of first and last digit of 252 is = " + sumFirstAndLast(252));
        System.out.println("Sum of first and last digit of 257 is = " + sumFirstAndLast(257));
        System.out.println("Sum of first and last digit of 0 is = " + sumFirstAndLast(0));
        System.out.println("Sum of first and last digit of 5 is = " + sumFirstAndLast(5));
        System.out.println("Sum of first and last digit of -10 is = " + sumFirstAndLast(-10));


    }

    public static int sumFirstAndLast(int number){

        if(number < 0){
            return -1;
        }

        int lastDigit = number % 10;
        int firstDigit = 0;
        while (number >= 10){
            number /= 10;
        }
        firstDigit = number;
        return firstDigit + lastDigit;

    }

}
