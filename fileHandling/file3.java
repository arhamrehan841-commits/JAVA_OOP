// File: CreateMultipleFiles.java
// This program creates three files: file1.txt, file2.txt, file3.txt
// It checks if they already exist and creates them if not.

import java.io.*;

public class CreateMultipleFiles {

    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            try {
                File file = new File("file" + i + ".txt");

                if (file.exists()) {
                    System.out.println(file.getName() + " already exists.");
                } else {
                    file.createNewFile();
                    System.out.println(file.getName() + " created successfully.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }
}
