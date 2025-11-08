// File: CreateFileExample.java
// This program creates a file named "data.txt" if it doesn't already exist.
// It demonstrates basic file creation and exception handling.

import java.io.*;

public class CreateFileExample {

    public static void main(String[] args) {

        try {
            // Create a File object
            File file = new File("data.txt");

            // Attempt to create a new file
            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            // Handle any I/O errors
            System.out.println("An error occurred.");
            e.printStackTrace();
        } finally {
            System.out.println("This message will appear every time.");
        }
    }
}
