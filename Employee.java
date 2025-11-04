import java.util.Scanner;

public class Employee {
    // Declare instance variables to store employee data
    String name;
    double basic, hra, da, total;

    void empDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        name = sc.nextLine();
        System.out.print("Enter basic salary: ");
        basic = sc.nextDouble();
        sc.close();
    }

    void salary() {
        hra = 0.1 * basic; // 10% HRA
        da = 0.05 * basic; // 5% DA
    }

    void total() {
        total = basic + hra + da;
        System.out.println("Employee: " + name);
        System.out.println("Total Salary: " + total);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.empDetails();
        e.salary();
        e.total();
    }
}
