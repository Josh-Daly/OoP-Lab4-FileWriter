//Paul Daly G00470372
//OOP Lab 4
//Exception Handling & File Writing/Reading

package ie.atu.week6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = 0;
        while(true){
            System.out.print("Enter your age: ");
            String text = sc.nextLine().trim();
            try {
                age = Integer.parseInt(text);
                System.out.println("Thanks! You entered age = " + age);
                break;
            }
            catch (NumberFormatException e){
                System.out.println("Invalid input " + e.getMessage());
            }
        }
    }
}