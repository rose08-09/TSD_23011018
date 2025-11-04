import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        //take integer input 
        int num = sc.nextInt();

        boolean isPrime = true;  // assume number is prime

        // num divisible by any number between 2 and num-1 is not prime
        if (num <= 1) {
            isPrime = false;  // 0 and 1 are not prime
        } else {
            // check for divisibility
            for (int i = 2; i <= num / 2; i++) {
               // if num divisible by i then not prime
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
            System.out.println(num + " is a Prime Number.");
        else
            System.out.println(num + " is NOT a Prime Number.");

        sc.close();
    }
}