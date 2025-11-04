import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        //create scanner object
        Scanner sc = new Scanner(System.in);
        // enter principal ammount 
        System.out.print("Enter Principal (P): ");
        double principal = sc.nextDouble();
        // enter rate of interest
        System.out.print("Enter Rate of Interest (R): ");
        double rate = sc.nextDouble();
        // enter time period 
        System.out.print("Enter Time in years (T): ");
        double time = sc.nextDouble();

        // Apply formula
        double si = (principal * rate * time) / 100;
        // display the result 
        System.out.println("Simple Interest = " + si);
       //close the scanner
        sc.close();
    }
}
