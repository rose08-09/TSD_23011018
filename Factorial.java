import java.util.Scanner; // Import Scanner for user input.

public class Factorial{
    // Recursive method to find factorial
    static int factorial(int n) {
        // Base case: Factorial of 0 and 1 is 1.
        if (n == 0 || n == 1)
            return 1;
        else
            // Recursive step: n * factorial of (n-1).
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object.
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // Read the integer input.

        // Call the recursive method and print the result.
        System.out.println("Factorial = " + factorial(num));
        sc.close(); // Close the scanner
    }
}