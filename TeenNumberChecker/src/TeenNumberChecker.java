public class TeenNumberChecker {

    /* We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).

    Write a method hasTeen with 3 parameters of type int.

    The method should return boolean and it needs to return true if one of parameters
     is in range 13(inclusive) - 19 (inclusive). Otherwise return false.

    EXAMPLES OF INPUT/OUTPUT:

    hasTeen(9, 99, 19);  should return true since 19 is in range 13 - 19
    hasTeen(23, 15, 42);  should return true since 15 is in range 13 - 19
    hasTeen(22, 23, 34);  should return false since numbers 22, 23, 34 are not in range 13-19
    NOTE: The hasTeen method  needs to be defined as public static like we have been doing
    so far in the course. NOTE: Do not add a  main method to solution code.
    */

    public static boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber){
//        if((firstNumber >= 13 && firstNumber <= 19) || (secondNumber >= 13 &&
//                secondNumber <= 19) || (thirdNumber >=13 && thirdNumber <= 19)){
        if(isTeen(firstNumber) || isTeen(secondNumber) || isTeen(thirdNumber)){
            return true;
        }else {
            return false;
        }
    }

    public static boolean isTeen(int number){
        if(number >= 13 && number <= 19){
            return true;
        }else{
            return false;
        }
    }
}
