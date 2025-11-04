import java.util.Scanner;

public class DuplicateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        // Convert the input string to a character array
        char[] chars = str.toCharArray(); 
        
        // Use a StringBuilder to construct the result without duplicates
        StringBuilder result = new StringBuilder();

        // Iterate through each character in the original array
        for (int i = 0; i < chars.length; i++) {
            boolean isDuplicate = false;
            
            // Check if the character has already appeared earlier in the string
            // This inner loop checks characters from the beginning up to the current index i-1
            for (int j = 0; j < i; j++) { 
                if (chars[i] == chars[j]) {
                    isDuplicate = true; // Mark as duplicate.
                    break; // No need to check further for this character
                }
            }
            
            // If the character is not a duplicate append it
            if (!isDuplicate) {
                result.append(chars[i]);
            }
        }

        System.out.println("String without duplicates: " + result);
        sc.close();
    }
}