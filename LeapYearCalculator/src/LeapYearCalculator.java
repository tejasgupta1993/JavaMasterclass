public class LeapYearCalculator {

//    Please read this entire page before attempting to solve this coding exercise.
//    Additional help is available by watching the video mentioned at the bottom of the page **
//            ---
//
//    Write a method isLeapYear with a parameter of type int named year.
//
//    The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
//
//    If the parameter is not in that range return false.
//
//    Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
//    otherwise return false.
//
//    A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
//
//    Examples of input/output:
//
//    isLeapYear(-1600); should return false since parameter is not in the range (1-9999)
//    isLeapYear(1600); should return true since 1600 is leap year
//    isLeapYear(2017); should return false since 2017 is not a leap year
//    isLeapYear(2000); should return true because 2000 is a leap year
//    NOTE: The isLeapYear method needs to be defined as public static like we have been
//    doing so far in the course.
//    NOTE: Do not add a  main method to solution code.

    public static boolean isLeapYear(int year){
        if(year < 1 || year > 9999){
            return false;
        }

        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    return true;
                }else{
                    return  false;
                }
            }else{
                return true;
            }
        }else{
            return false;
        }
    }
}
