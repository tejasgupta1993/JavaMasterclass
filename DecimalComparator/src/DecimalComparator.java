public class DecimalComparator {

    /* Write a method areEqualByThreeDecimalPlaces with two parameters of type double.

The method should return boolean and it needs to return true if two double numbers are
 the same up to three decimal places. Otherwise return false.

EXAMPLES OF INPUT/OUTPUT:

areEqualByThreeDecimalPlaces(-3.1756, -3.175); should return true since numbers are equal up to 3 decimal places.
areEqualByThreeDecimalPlaces(3.175, 3.176); should return false since numbers are not equal up to 3 decimal places
areEqualByThreeDecimalPlaces(3.0, 3.0); should return true since numbers are equal up to 3 decimal places.
NOTE: The areEqualByThreeDecimalPlaces method  needs to be defined as public static like we have been doing
 so far in the course. NOTE: Do not add a  main method to solution code.
*/

    public  static boolean comparator(double firstValue, double secondValue){
        int num1 = (int) (firstValue * 1000);
        int num2 = (int) (secondValue * 1000);

        if(num1 == num2){
            return true;
        }
        return false;
    }
}
