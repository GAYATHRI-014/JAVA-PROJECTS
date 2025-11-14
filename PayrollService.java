package service;

import model.Employee;
import java.io.*;
import java.util.*;

public class PayrollService {

    private static final String FILE = "employees.txt";

    public void addEmployee(Employee emp) {
        try (FileWriter fw = new FileWriter(FILE, true)) {
            fw.write(emp.toString() + "\n");
            System.out.println("Employee Added Successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void viewEmployees() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE))) {
            String line;

            System.out.println("\n--- Employee List ---");
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                double sal = Double.parseDouble(data[2]);
                double netSalary = sal - (sal * 0.10);

                System.out.println("ID: " + data[0] +
                        " | Name: " + data[1] +
                        " | Gross Salary: " + sal +
                        " | Net Salary: " + netSalary);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
