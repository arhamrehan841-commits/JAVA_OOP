// File: WriteToFile.java
// This program writes multiple lines of text into a file called "newfile.txt".

import java.io.*;

public class WriteToFile {

    public static void main(String[] args) {

        try {
            // FileWriter writes text to a file
            FileWriter writer = new FileWriter("newfile.txt");

            // Writing multiple lines
            writer.write("Name : Arham\n");
            writer.write("Age : 19\n");
            writer.write("Height : 5.10\n");
            writer.write("Weight : 70\n");
            writer.write("Country : Pakistan");

            System.out.println("Successfully written to the file.");

            writer.close(); // Always close the writer
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
