import java.util.Scanner;

public class StudentPercent {
    String name;
    int m1, m2, m3;
    double percentage;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        name = sc.nextLine();
        System.out.print("Enter marks in 3 subjects: ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        sc.close();
    }

    void compute() {
        percentage = (m1 + m2 + m3) / 3.0;
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Percentage: " + percentage + "%");
    }

    public static void main(String[] args) {
        StudentPercent s = new StudentPercent();
        s.input();
        s.compute();
        s.display();
    }
}
