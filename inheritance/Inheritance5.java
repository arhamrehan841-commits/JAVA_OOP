// Inheritance5.java
// -----------------
// Demonstrates variable hiding and accessing parent variables using super

class Parent {
    int value = 100; // Parent variable

    void display() {
        System.out.println("Parent value: " + value);
    }
}

class Child extends Parent {
    int value = 50; // Child variable hiding parent variable

    void display() {
        System.out.println("Child value: " + value);
        System.out.println("Parent value using super: " + super.value); // Access parent variable
        super.display(); // Call parent method
    }
}

public class Inheritance5 {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
