public class Main {

    public static void main(String[] args) {
        System.out.println(LeapYearCalculator.isLeapYear(2100));
        System.out.println(LeapYearCalculator.isLeapYear(1700));
        System.out.println(LeapYearCalculator.isLeapYear(1800));
        System.out.println(LeapYearCalculator.isLeapYear(1900));
        System.out.println(LeapYearCalculator.isLeapYear(2200));
        System.out.println(LeapYearCalculator.isLeapYear(2300));
        System.out.println(LeapYearCalculator.isLeapYear(2500));
        System.out.println(LeapYearCalculator.isLeapYear(2600));

        System.out.println(LeapYearCalculator.isLeapYear(1600));
        System.out.println(LeapYearCalculator.isLeapYear(2000));
        System.out.println(LeapYearCalculator.isLeapYear(2400));

        System.out.println(LeapYearCalculator.isLeapYear(-1600));
        System.out.println(LeapYearCalculator.isLeapYear(1600));
        System.out.println(LeapYearCalculator.isLeapYear(2017));
        System.out.println(LeapYearCalculator.isLeapYear(2000));


    }
}
