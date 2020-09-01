public class Main {

    public static void main(String[] args) {

        System.out.println(NumberOfDaysInAMonth.isLeapYear(-1600));
        System.out.println(NumberOfDaysInAMonth.isLeapYear(1600));
        System.out.println(NumberOfDaysInAMonth.isLeapYear(2017));
        System.out.println(NumberOfDaysInAMonth.isLeapYear(2000));
        System.out.println(NumberOfDaysInAMonth.isLeapYear(1900));

        System.out.println(NumberOfDaysInAMonth.getDaysInAMonth(1, 2020));
        System.out.println(NumberOfDaysInAMonth.getDaysInAMonth(2, 2020));
        System.out.println(NumberOfDaysInAMonth.getDaysInAMonth(2, 2018));
        System.out.println(NumberOfDaysInAMonth.getDaysInAMonth(-1, 2020));
        System.out.println(NumberOfDaysInAMonth.getDaysInAMonth(1, -2020));


    }
}
