// File: AppendEmail.java
// This program appends an email address to "newfile.txt".

import java.io.*;

public class AppendEmail {

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("newfile.txt", true); // true = append mode
            writer.write("\nEmail : arham@example.com");
            System.out.println("Email appended successfully.");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
