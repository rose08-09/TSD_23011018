// Program to count vowels, consonants, digits, and special characters
import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // For user input

        System.out.print("Enter a string: ");
        String str = sc.nextLine(); // Read full line of text

        // Initialize counters
        int vowels = 0, consonants = 0, digits = 0, special = 0;

        // Convert string to lowercase to simplify checks
        str = str.toLowerCase();

        // Loop through each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Get each character

            if (ch >= 'a' && ch <= 'z') { // Check for letters
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    vowels++; // Count vowels
                else
                    consonants++; // Count consonants
            } 
            else if (ch >= '0' && ch <= '9')
                digits++; // Count digits
            else if (ch != ' ')
                special++; // Count special characters excluding spaces
        }

        // Display results
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + special);

        sc.close(); // Close scanner
    }
}
