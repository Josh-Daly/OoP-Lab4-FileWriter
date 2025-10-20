package ie.atu.week6;

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteOnce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the file name (students.txt for example): ");
        String fileName = sc.nextLine().trim();

        System.out.print("Enter a name to save: ");
        String name = sc.nextLine().trim();

        try(PrintWriter out = new PrintWriter(new FileWriter(fileName, true))){
            out.println(name);
            System.out.println("Saved to " + fileName);
        }
        catch(IOException ex){
            System.out.println("Could not write to file: " + ex.getMessage());
        }
    }
}
