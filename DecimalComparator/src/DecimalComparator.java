public class DecimalComparator {

    public  static boolean comparator(double firstValue, double secondValue){
        int num1 = (int) (firstValue * 100);
        int num2 = (int) (secondValue * 100);

        if(num1 == num2){
            return true;
        }
        return false;
    }
}
