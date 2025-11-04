import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        //scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        //take integer input 
        int year = sc.nextInt();

        
        // divisible by 4, not divisible by 100 unless also divisible by 400
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }

        sc.close();
    }
}
