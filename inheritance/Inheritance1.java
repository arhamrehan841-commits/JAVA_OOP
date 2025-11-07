// Inheritance1.java
// -----------------
// Demonstrates single inheritance where Car and Bike inherit from Vehicle

// Base class (Parent)
class Vehicle {
    // Method common to all vehicles
    public void start() {
        System.out.println("Vehicle started vroom vromm .........");
    }
}

// Derived class (Child)
class Car extends Vehicle {
    // Car-specific behavior
    void drive() {
        start(); // Calls Vehicle's start() method
        System.out.println("Started driving");
    }
}

// Another Derived class
class Bike extends Vehicle {
    // Bike-specific behavior
    void ride() {
        start(); // Calls Vehicle's start() method
        System.out.println("Started riding");
    }
}

// Main class to test the inheritance
public class Inheritance1 {
    public static void main(String[] args) {
        Car corolla = new Car(); // Creating Car object
        Bike h125 = new Bike();  // Creating Bike object

        corolla.drive(); // Executes Car's drive
        h125.ride();     // Executes Bike's ride
    }
}
