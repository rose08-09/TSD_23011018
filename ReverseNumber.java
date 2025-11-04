import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        //Initialize a Scanner to get input from the user.
        Scanner scanner = new Scanner(System.in);
        
        // input
        System.out.print("Enter number to reverse: ");
        
        //Read the number and store it in the 'originalNumber' variable.
        int originalNumber = scanner.nextInt();
        
        //a copy of the number to manipulate in the loop, 
        // while keeping the original for the final output.
        int number = originalNumber;
        
        //Initialize 'reversedNumber' to 0. This variable will store the result.
        long reversedNumber = 0; // Use long to prevent overflow for very large integers.
        
        // WHILE loop continues as long as 'number' is greater than 0
        while (number > 0) {
            
            //Extract the last digit of the current number.
            // The modulo operator (%) gives the remainder when divided by 10.
            int lastDigit = number % 10; 
            //Build the reversed number.
            //Multiply 'reversedNumber' by 10 to shift its existing digits one position to the left.
            //Add the 'lastDigit' extracted in the previous step.
            reversedNumber = (reversedNumber * 10) + lastDigit;
            
            //Remove the last digit from the original number.
            //Integer division (/) by drops the last digit.
            number = number / 10;
        }
        
        // Display the final result.
        System.out.println("\nOriginal number: " + originalNumber);
        System.out.println("Reversed number: " + reversedNumber);
        
        //Close the scanner.
        scanner.close();
    }
}