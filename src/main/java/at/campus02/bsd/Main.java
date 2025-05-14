package at.campus02.bsd;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println("Andreas Hofer");
        System.out.println(calculator.add(1, 2));
        System.out.println(calculator.subtract(5, 2));
        System.out.println(calculator.divide(100, 5));
        System.out.println(calculator.multiply(20, 10));
    }
}
