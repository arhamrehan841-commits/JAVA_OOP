// File: DeleteOldFiles.java
// This program deletes all files starting with "old_" in a specified folder.

import java.io.*;

public class DeleteOldFiles {

    public static void main(String[] args){
        
        // To check if one or more files got deleted
        int no_of_files = 0;

        // To check if any files got deleted or not
        boolean val = false;

        // Path to folder
        String folderPath = "C:\\Users\\etechs\\Desktop\\Java";

        // This object contains whole folder
        File folder = new File(folderPath);
        
        // This array stores all files
        File[] files = folder.listFiles() ;

        try{ 

            // This loops through name of every file in the folder and delete it if it starts with "old"
            for(File file : files){
                if(file.getName().startsWith("old")){
                    file.delete();
                    no_of_files++;
                    // If any file got deleted we are setting val to true
                    val=true;
                }
            }   

            if(val==true){
                if(no_of_files==1){ 
                    System.out.println("Sucessfully deleted the file");
                }
                else{
                    System.out.println("Sucessfully deleted the files");
                }    
            }
            else{
                System.out.println("No files to delete");
            }  

        }
        catch (Exception e){
            e.printStackTrace();
        } 

    }
}
