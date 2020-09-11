public class MinutesToYearsAndDaysCalculator {

    /* convert given minutes to years and days. print output as XX min = YY y and ZZ d .
    create method as printYearsAndDays with parameter long named minutes. return -1 if minutes is less than 0.
EXAMPLES OF INPUT/OUTPUT:

printYearsAndDays(525600); should print "525600 min = 1 y and 0 d"
printYearsAndDays(1051200); should print "1051200 min = 2 y and 0 d"
printYearsAndDays(561600); should print "561600 min = 1 y and 25 d"
*/

    public static void printYearsAndDays(long minutes){

        if(minutes < 0){
            System.out.println("Invalid value!");
            return;
        }
        long years = minutes / (60 * 24 * 365);
        long remainingdays = (minutes % (60 * 24 * 365)) / (60 * 24);

        System.out.println(minutes + " min = " + years +
                " y " + remainingdays + " d");
    }
}
