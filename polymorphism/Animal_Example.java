/*
 * ==========================================
 *   ANIMAL EXAMPLE – METHOD OVERRIDING
 * ==========================================
 *
 * Method Overriding = Runtime Polymorphism
 * ------------------------------------------------
 * When a subclass provides its own version of a method
 * that already exists in the parent class.
 */

class Animal {

    public void sound() {
        System.out.println("Animal sound.......");
    }
}

class Dog extends Animal {

    public void sound() {
        super.sound();  // Calls parent version first
        System.out.println("Woof Woof.......");
    }
}

class Cat extends Animal {

    public void sound() {
        super.sound();
        System.out.println("Meow.......");
    }
}

class Cow extends Animal {

    public void sound() {
        super.sound();
        System.out.println("Moo.......");
    }
}

public class Polymorphism {

    public static void main(String[] args) {

        System.out.println("=== Animal Example (Runtime Polymorphism) ===");

        Animal[] animals = new Animal[3];

        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Cow();

        // Enhanced for-loop: for (Type var : array)
        for (Animal a : animals) {
            a.sound();   // Polymorphism in action
            System.out.println();
        }
    }
}
