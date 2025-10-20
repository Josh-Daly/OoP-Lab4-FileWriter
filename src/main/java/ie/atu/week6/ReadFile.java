package ie.atu.week6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        showFile();
    }
    static void showFile(){
        //Most of following code handles printing contents of a the file students.txt to system io
        //Two try loops to catch errors for not reading or closing a file
        BufferedReader br = null;
        try {
            FileReader neverUsed = new FileReader("students.txt");
            br = new BufferedReader(neverUsed);
            System.out.println("Contents of students.txt");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(" - " + line);
            }
        }
        catch(IOException ex) {
            System.out.println("Could not read file: " + ex.getMessage());
        }
        finally{
            if (br!= null){
                try{
                    br.close();
                }
                catch (IOException closeEx)
                {
                    System.out.println("Could not close file: " + closeEx.getMessage());
                }
            }
        }
    }
}