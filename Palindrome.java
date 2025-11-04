import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        // Create a Scanner object for input.
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string.
        System.out.print("Enter a word: ");
        
        // Read the input string.
        String original = scanner.nextLine();
        
        // Remove spaces and convert to lowercase for uniform comparison.
        String cleanString = original.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        // Use the StringBuilder class to reverse the cleaned string.
        String reversed = new StringBuilder(cleanString).reverse().toString();
        
        // Compare the original cleaned string with the reversed string.
        if (cleanString.equals(reversed)) {
            System.out.println("'" + original + "' is a palindrome");
        } else {
            System.out.println("'" + original + "' is not a palindrome");
        }
        
        // Close the scanner.
        scanner.close();
    }
}