public class PositiveNegativeZero {

    public static void main (String[] args){
        chechNumber(5);
        chechNumber(-10);
        chechNumber(0);
    }

    public static void chechNumber (int number){
        if(number > 0){
            System.out.println("Positive");
        }else if(number < 0){
            System.out.println("Negative");
        }else if(number == 0){
            System.out.println("Zero");
        }
    }
}
