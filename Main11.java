package main;

import model.Employee;
import service.PayrollService;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PayrollService service = new PayrollService();

        while (true) {
            System.out.println("\n--- Employee Payroll System ---");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter ID: ");
                String id = sc.nextLine();

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Salary: ");
                double salary = sc.nextDouble();

                service.addEmployee(new Employee(id, name, salary));

            } else if (choice == 2) {
                service.viewEmployees();

            } else {
                System.exit(0);
            }
        }
    }
}
