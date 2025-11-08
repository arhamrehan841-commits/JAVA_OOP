// File: NullPointerExceptionExample.java
// This program demonstrates handling NullPointerException

public class NullPointerExceptionExample {

    public static void main(String[] args){

        String s = null; // String reference is null

        try {
            // Attempting to access a method on a null object
            System.out.println(s.length());
        }
        catch(NullPointerException e) {
            // This block executes if a NullPointerException occurs
            System.out.println("An exception occurred:\n" + e);
        }

        System.out.println("Program continues after exception handling.");
    }
}
