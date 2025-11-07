// Inheritance2.java
// -----------------
// Demonstrates how super() can call parent constructor and super.method() can call parent method

// Parent class
class Person {
    String name;

    // Constructor for Person
    Person(String name) {
        this.name = name;
    }

    // Method to display name
    void showDetails() {
        System.out.println("Name : " + name);
    }
}

// Child class
class Student extends Person {
    int roll_no;

    // Constructor for Student
    Student(String name, int roll_no) {
        super(name); // Call parent constructor
        this.roll_no = roll_no;
    }

    // Overriding parent method
    void showDetails() {
        super.showDetails(); // Call parent showDetails() first
        System.out.println("Roll no : " + roll_no);
    }
}

// Main class
public class Inheritance2 {
    public static void main(String[] args) {
        Student s1 = new Student("Arham", 30);
        s1.showDetails(); // Prints parent and child details
    }
}
