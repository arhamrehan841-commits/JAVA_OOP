// File: Employee.java

// This class demonstrates encapsulation for employee salary
class Employee {

    // Private variable to store salary
    private static int min_salary = 120000;

    // Public method to update salary
    public void updateSalary(int salaryv) {
        if (salaryv == min_salary) {
            System.out.println("Cannot update because the entered salary is same as the current salary");
        } else if (salaryv < min_salary) {
            System.out.println("Cannot update because entered salary is less than the minimum fixed salary");
        } else {
            min_salary = salaryv;
            System.out.println("Salary updated successfully");
        }
    }

    // Public method to view salary
    public void getSalary() {
        System.out.println(min_salary);
    }
}

// Test the class
public class Encapsulation {
    public static void main(String[] args) {

        Employee e1 = new Employee();

        // Update salary safely
        e1.updateSalary(125000); // valid, updates salary
        e1.updateSalary(120000); // less than current salary, gives warning
    }
}
