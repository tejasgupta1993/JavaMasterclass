public class Main {

    public static void main(String[] args) {
        long speedInMiles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Speed in miles = " + speedInMiles);

        SpeedConverter.printConversion(10.5);
    }
}
