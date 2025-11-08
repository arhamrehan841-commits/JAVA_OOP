// File: UpperCaseFile.java
// This program reads a file and prints its content in uppercase letters.

import java.io.*;

public class UpperCaseFile {

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("newfile.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line.toUpperCase());
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
