public class MinutesToYearsAndDaysCalculator {

    public static void printYearsAndDays(long minutes){

        if(minutes < 0){
            System.out.println("Invalid value!");
            return;
        }
        long years = minutes / (60 * 24 * 365);
        long days = (minutes % (60 * 24 * 365)) / (60 * 24);

        System.out.println(minutes + " min = " + years +
                " y " + days + " d");
    }
}
