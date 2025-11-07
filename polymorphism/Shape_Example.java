/*
 * ==========================================
 *   SHAPE EXAMPLE – METHOD OVERLOADING
 * ==========================================
 *
 * Even when using inheritance, we can overload methods
 * based on parameter types and counts.
 */

class Shape {

    String area(int length, int width) {
        String result = "Default area: " + (length * width);
        return result;
    }
}

class Circle extends Shape {

    double area(double radius) {
        return 3.142 * radius * radius;
    }
}

class Rectangle extends Shape {

    double area(double length, double width) {
        return length * width;
    }
}

public class Polymorphism {

    public static void main(String[] args) {

        System.out.println("=== Shape Example (Overloading) ===");

        Shape s = new Shape();
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        System.out.println(s.area(5, 10));             // Shape method
        System.out.println("Circle area: " + c.area(3.5));
        System.out.println("Rectangle area: " + r.area(4.0, 6.0));
    }
}
