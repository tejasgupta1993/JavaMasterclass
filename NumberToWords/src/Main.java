public class Main {

    public static void main(String[] args) {

        System.out.println(NumberToWords.getDigitNumber(0));
        System.out.println(NumberToWords.getDigitNumber(123));
        System.out.println(NumberToWords.getDigitNumber(-12));
        System.out.println(NumberToWords.getDigitNumber(5200));
        System.out.println("***********");
        System.out.println(NumberToWords.reverseNumber(-1231));
        System.out.println(NumberToWords.reverseNumber(1212));
        System.out.println(NumberToWords.reverseNumber(1234));
        System.out.println(NumberToWords2.reverse(100));
        System.out.println("**************");
        NumberToWords.numberToWords(123);
        NumberToWords.numberToWords(1010);
        NumberToWords.numberToWords(1000);
        NumberToWords.numberToWords(-12);

    }
}
