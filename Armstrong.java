import java.util.Scanner; // Import Scanner for user input

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // Read the integer
        
        // Initialize sum and create a temporary variable
        int sum = 0, temp = num; 

        // Loop continues as long as there are digits left in the number
        while (temp > 0) {
            int digit = temp % 10; // Extract the last digit
            // Add the cube of the digit to the sum
            sum += digit * digit * digit; 
            temp /= 10; // Remove the last digit
        }

        // Compare the calculated sum with the original number
        if (sum == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");

        sc.close(); // Close the scanner
    }
}