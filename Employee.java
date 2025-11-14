package model;

public class Employee {
    private String id;
    private String name;
    private double salary;

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double calculateNetSalary() {
        double tax = salary * 0.10;  
        return salary - tax;
    }

    public String toString() {
        return id + "," + name + "," + salary;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
}
