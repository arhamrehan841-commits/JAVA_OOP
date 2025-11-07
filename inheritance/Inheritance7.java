// Inheritance7.java
// -----------------
// Demonstrates calling parent method from overridden method using super

class Vehicle {
    void move() {
        System.out.println("Vehicle started vroom vromm .........");
    }
}

class Car extends Vehicle {
    @Override
    void move() {
        super.move(); // Call parent move()
        System.out.println("Car started");
    }
}

public class Inheritance7 {
    public static void main(String[] args) {
        Car c = new Car();
        c.move();
    }
}
