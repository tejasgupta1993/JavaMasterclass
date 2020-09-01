public class SumOfFirstAndLastDigit {

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
