// Inheritance6.java
// -----------------
// Demonstrates encapsulation using private variables and getters/setters

class Employee {
    private int salary = 0; // Private variable

    // Setter for salary
    public void setSalary(int salaryv) {
        System.out.println("Salary fixed to : " + salaryv);
        salary = salaryv;
    }

    // Getter for salary
    public int getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    String dept = "None";

    public void setDept(String deptv) {
        System.out.println("Dept fixed to : " + deptv);
        dept = deptv;
    }

    public void showDetails() {
        if (super.getSalary() == 0)
            System.out.println("Salary is not set yet");
        else
            System.out.println("Salary is : " + super.getSalary());

        if (dept.equals("None"))
            System.out.println("Dept is not set yet");
        else
            System.out.println("Dept is : " + dept);
    }
}

public class Inheritance6 {
    public static void main(String[] args) {
        Manager m1 = new Manager();
        m1.setSalary(80000);
        m1.setDept("IT");
        m1.showDetails();
    }
}
