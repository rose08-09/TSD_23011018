// Program to find the largest and smallest number in an array
import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Create Scanner object for input

        // Ask the user how many numbers they want to enter
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();  // Read number of elements

        int[] numbers = new int[n];  // Create an array of size n

        // Take array input from the user
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();  // Store user-entered numbers in the array
        }

        // Assume first element as both largest and smallest initially
        int largest = numbers[0];
        int smallest = numbers[0];

        // Loop through the array to find largest and smallest
        for (int i = 1; i < n; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];  // Update largest if current number is greater
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i]; // Update smallest if current number is smaller
            }
        }

        // Display the results
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);

        sc.close(); // Close the scanner to free system resources
    }
}
