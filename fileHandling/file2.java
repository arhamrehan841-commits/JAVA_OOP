// File: CheckAndCreateFile.java
// This program checks if "data.txt" exists. If not, it creates the file.

import java.io.*;

public class CheckAndCreateFile {

    public static void main(String[] args) {

        try {
            File file = new File("data.txt");

            if (file.exists()) {
                System.out.println("File exists.");
            } else {
                file.createNewFile();
                System.out.println("File did not exist but was created now.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
