public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour){

        if(kilometersPerHour < 0){
            return -1;
        }

        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometeresPerHour) {

        if (kilometeresPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometeresPerHour);
            System.out.println(kilometeresPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
