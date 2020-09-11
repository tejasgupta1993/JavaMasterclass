public class MegaBytesConverter {

//    ** Please read this entire page before attempting to solve this coding exercise.
//    Additional help is available by watching the video mentioned at the bottom of the page **
//            ---
//
//    Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes.
//
//    The method should not return anything (void) and it needs to calculate
//    the megabytes and remaining kilobytes from the kilobytes parameter.
//
//    Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".
//    XX represents the original value kiloBytes. YY represents the calculated megabytes. ZZ represents the calculated remaining kilobytes.

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int remainder = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainder + " KB");
        }
    }
}
