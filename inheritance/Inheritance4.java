// Inheritance4.java
// -----------------
// Demonstrates method overriding and upcasting

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Inheritance4 {
    public static void main(String[] args) {
        Animal obj = new Dog(); // Upcasting
        obj.makeSound();        // Calls Dog's version of makeSound()
    }
}
