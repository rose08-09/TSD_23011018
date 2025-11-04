// Program to perform Binary Search in an array
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array input
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        // Take element to search
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int low = 0, high = n - 1;
        boolean found = false;

        // Binary Search logic
        while (low <= high) {
            int mid = (low + high) / 2; // Find middle index

            if (arr[mid] == key) {       // If element found
                System.out.println("Element found at position: " + (mid + 1));
                found = true;
                break;
            } else if (arr[mid] < key)   // If key is greater, search right half
                low = mid + 1;
            else                         // If key is smaller, search left half
                high = mid - 1;
        }

        if (!found)
            System.out.println("Element not found.");

        sc.close(); // Close scanner
    }
}
