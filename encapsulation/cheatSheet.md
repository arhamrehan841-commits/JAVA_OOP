# Java Encapsulation Cheat Sheet

**Encapsulation** in Java is the practice of **hiding the internal details** of a class (its variables) and **providing public methods** to access or update them safely.  
It helps **protect data**, **apply validation**, and **make code maintainable**.

---

## Key Points

- **Private variables** store internal data.
- **Public setters** allow controlled updates.
- **Public getters** allow controlled reading.
- Can include **validation** inside setters.

---

## Small Example

```java
class Student {
    private int marks; // hidden variable

    // setter with validation
    public void setMarks(int m) {
        if(m >= 0 && m <= 100) marks = m;
        else System.out.println("Marks must be 0-100");
    }

    // getter to read marks
    public int getMarks() {
        return marks;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setMarks(85);             // update safely
        System.out.println(s.getMarks()); // read safely
    }
}
