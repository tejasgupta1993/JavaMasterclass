public class NumberPalindrome {

    public static boolean isPalindrome(int number){

        if(number < 0){
            number *= -1;
        }

        int originalNumber = number;
        int reverseNumber = 0;

        while(number > 0){
            reverseNumber = ((reverseNumber * 10) + (number % 10));
            number /= 10;
        }

        return (originalNumber == reverseNumber);
    }
}
