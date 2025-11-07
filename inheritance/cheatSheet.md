# Java OOP Concepts Cheat Sheet

This cheat sheet summarizes key **OOP concepts in Java** with short explanations and examples.

| Concept                | Description                                                 | Example / Syntax             |
|------------------------|-------------------------------------------------------------|-----------------------------|
| **Inheritance**         | Enables a class to reuse methods/fields from another class | `class Child extends Parent`|
| **super()**             | Calls parent constructor inside child constructor          | `super(name);`             |
| **super.method()**      | Calls parent method from child class                        | `super.showDetails();`     |
| **super.variable**      | Access parent variable if hidden by child variable         | `super.value;`             |
| **Method Overriding**   | Child redefines parent method with same signature          | `@Override void makeSound()`|
| **Variable Hiding**     | Child variable hides parent variable                        | `int value; super.value;`  |
| **Encapsulation**       | Private variables accessed via getters/setters             | `private int salary;`      |
| **Upcasting**           | Parent reference refers to child object                    | `Animal a = new Dog();`    |
| **Runtime Polymorphism**| Calls child’s overridden methods using parent reference    | `a.makeSound();`           |
| **Multilevel Inheritance** | Inheritance chain: Grandparent -> Parent -> Child        | `class Human extends Mammal`|
| **Single Inheritance**  | Child inherits directly from one parent                    | `class Car extends Vehicle`|
| **Overridden + super()**| Call parent’s method while overriding                       | `super.move();`            |
| **Private member access**| Access private fields of parent via getter/setter         | `super.getSalary();`       |

---

**Usage Tips:**
- Use **private variables** and public **getters/setters** for encapsulation.
- `super()` and `super.method()` help manage constructors and overridden methods.
- Upcasting + overriding enable **runtime polymorphism**.
