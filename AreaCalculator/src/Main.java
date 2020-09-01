public class Main {

    public static void main(String[] args) {

        System.out.println("Area of circle of radius 5 = " + AreaCalculator.area(5));
        System.out.println(AreaCalculator.area(-1));
        System.out.println("Area of rectangle with sides 5 and 4 = " + AreaCalculator.area(5, 4));
        System.out.println(AreaCalculator.area(-1, -2));
        System.out.println(AreaCalculator.area(-1, 2));
    }
}
