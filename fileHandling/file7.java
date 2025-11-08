// File: CountLines.java
// This program counts the number of lines in "newfile.txt".

import java.io.*;

public class CountLines {

    public static void main(String[] args) {

        int counter = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("newfile.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                counter++;
            }

            System.out.println("Number of lines: " + counter);

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
