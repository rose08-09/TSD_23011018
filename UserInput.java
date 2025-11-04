import java.util.Scanner;  // Import Scanner class to take user input

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object

        System.out.print("Enter your name: ");
        String name = sc.nextLine();  // Read string input

        System.out.print("Enter your age: ");
        int age = sc.nextInt();  // Read integer input

        // Display a message
        System.out.println("Welcome, " + name + "You are " + age + " years old.");

        sc.close();  // Close the scanner
    }
}
