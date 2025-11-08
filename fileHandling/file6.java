// File: ReadFile.java
// This program reads a file line by line and prints its content to the console.

import java.io.*;

public class ReadFile {

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("newfile.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
