// File: FileNotFoundExceptionExample.java
// This program demonstrates handling FileNotFoundException

import java.io.*;

public class FileNotFoundExceptionExample {

    public static void main(String[] args){

        try {
            // Trying to open a file that may not exist
            BufferedReader br = new BufferedReader(new FileReader("new1.txt"));
            System.out.println("File opened successfully!");
        }
        catch(FileNotFoundException e) {
            // This block executes if the file is not found
            System.out.println("An exception occurred:\n" + e);
        }

        System.out.println("Program continues after exception handling.");
    }
}
