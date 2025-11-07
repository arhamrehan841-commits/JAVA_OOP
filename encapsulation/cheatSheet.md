# Java Encapsulation Cheat Sheet

Encapsulation in Java is the practice of **hiding internal data** (variables) and **controlling access** through **public methods**. This makes code safe, maintainable, and flexible.

---

## Key Concepts

| Concept           | Explanation / Example |
|------------------|----------------------|
| **Encapsulation** | Hiding internal data (`private`) and controlling access via methods (`public`). |
| **Private variable** | `private int salary;` – cannot access directly outside the class. |
| **Public setter** | `public void setSalary(int s) { salary = s; }` – safely updates value. |
| **Public getter** | `public int getSalary() { return salary; }` – safely reads value. |
| **Validation** | Inside setter: `if(s >= 0) salary = s; else System.out.println("Invalid");` |

---

## Examples

### BankAccount
```java
private float balance;

void setBalance(float b) {
    if(b >= 0) balance = b;
}

void getBalance() {
    System.out.println(balance);
}
