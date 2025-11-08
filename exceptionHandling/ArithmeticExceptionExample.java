// File: ArithmeticExceptionExample.java
// This program demonstrates handling ArithmeticException (divide by zero)

public class ArithmeticExceptionExample {

    public static void main(String[] args){
        
        int b = 10;
        int c = 0;  // division by zero will occur here

        try {
            int a = b / c; // risky code: dividing by zero
            System.out.println("Result: " + a); 
        }
        catch(ArithmeticException e) {
            // This block executes if an ArithmeticException occurs
            System.out.println("An exception occurred: " + e);
        }

        System.out.println("Program continues after exception handling.");
    }
}
