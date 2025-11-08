// File: AppendDateTime.java
// This program appends the current date and time to "newfile.txt" each time it runs.

import java.io.*;
import java.time.*;

public class AppendDateTime {

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("newfile.txt", true);

            LocalDate date = LocalDate.now();
            LocalTime time = LocalTime.now();

            writer.write("\nDate : " + date + "\nTime : " + time);
            System.out.println("Date and time appended successfully.");

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
