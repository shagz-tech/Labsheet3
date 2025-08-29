import java.util.Scanner;
class MathOperation {
    public int add(int a, int b) {
        if (a < 0 || b < 0) {
            System.out.println("Error: Negative numbers are not allowed.");
            return 0;
        }
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Error: Negative numbers are not allowed.");
            return 0;
        }
        return a + b + c;
    }
    public double add(double a, double b) {
        return a + b;
    }
}

public class Q_3{
    public static void main(String[] args) {
        MathOperation mo = new MathOperation();
        System.out.println("add(5, 10) = " + mo.add(5, 10));
        System.out.println("add(5, 10, 15) = " + mo.add(5, 10, 15));
        System.out.println("add(5.5, 4.5) = " + mo.add(5.5, 4.5));
        System.out.println("add(-5, 10) = " + mo.add(-5, 10));
    }
}

