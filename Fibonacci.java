import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int a = 0, b = 1, i = 1;
        System.out.print("Fibonacci Series: ");

        do {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
            i++;
        } while (i <= n);

        sc.close();
    }
}
