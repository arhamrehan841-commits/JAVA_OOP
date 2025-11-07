// Inheritance3.java
// -----------------
// Demonstrates multilevel inheritance (Animal -> Mammal -> Human)

class Animal {
    void breathe() {
        System.out.println("Animal breathing.......");
    }
}

class Mammal extends Animal {
    @Override
    void breathe() {
        System.out.println("Mammal breathing.......");
    }
}

class Human extends Mammal {
    @Override
    void breathe() {
        System.out.println("Human breathing.......");
    }
}

public class Inheritance3 {
    public static void main(String[] args) {
        Animal h = new Human(); // Upcasting
        h.breathe();            // Calls Human's breathe() due to runtime polymorphism
    }
}
