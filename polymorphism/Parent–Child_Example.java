/*
 * =======================================================
 *   PARENT–CHILD EXAMPLE – BOTH TYPES OF POLYMORPHISM
 * =======================================================
 */

class Parent {

    // ----- Method Overloading -----
    void display() {
        System.out.println("Display with no arguments (Parent)");
    }

    void display(String msg) {
        System.out.println("Display with message: " + msg);
    }

    // ----- Method to be Overridden -----
    void show() {
        System.out.println("Parent show() method");
    }
}

class Child extends Parent {

    // ----- Method Overriding -----
    @Override
    void show() {
        System.out.println("Child show() method : Overridden");
    }

    // ----- Method Overloading (New version) -----
    void display(int num) {
        System.out.println("Display with integer: " + num);
    }
}

public class Polymorphism {

    public static void main(String[] args) {

        System.out.println("=== Parent–Child Example (Overloading + Overriding) ===");

        Child c = new Child();

        // Compile-time polymorphism
        c.display();
        c.display("Hello!");
        c.display(10);

        System.out.println("\n=== Runtime Polymorphism (Overriding) ===");

        Parent p;          // Parent reference
        p = new Child();   // Child object assigned

        // Decided at runtime → executes Child’s version
        p.show();
    }
}
