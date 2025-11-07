/*
 * ==============================================
 *   POLYMORPHISM IN JAVA – METHOD OVERLOADING
 * ==============================================
 *
 * Method Overloading = Compile-time Polymorphism
 * ------------------------------------------------
 * When multiple methods have the same name
 * but different parameter lists (different number,
 * type, or order of parameters).
 *
 * The compiler decides which method to call
 * based on the arguments passed.
 */

class Calculator {

    // Overloaded method #1 – takes two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method #2 – takes three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method #3 – takes two doubles
    double add(double a, double b) {
        return a + b;
    }
}

public class Polymorphism {

    public static void main(String[] args) {

        System.out.println("=== Calculator Example (Compile-time Polymorphism) ===");

        Calculator calc = new Calculator();

        // Method chosen by compiler based on parameter type
        System.out.println("Sum of two integers: " + calc.add(5, 10));
        System.out.println("Sum of three integers: " + calc.add(5, 10, 15));
        System.out.println("Sum of two doubles: " + calc.add(2.5, 3.5));
    }
}
