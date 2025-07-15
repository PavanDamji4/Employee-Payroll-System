package com.anurag.payroll;

import com.anurag.payroll.dao.EmployeeDAO;
import com.anurag.payroll.entity.Employee;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeDAO dao = new EmployeeDAO();
        int choice;

        do {
            System.out.println("\n===== Employee Payroll Menu =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter name: ");
                    String name = scanner.next();
                    System.out.print("Enter department: ");
                    String dept = scanner.next();
                    System.out.print("Enter salary: ");
                    double salary = scanner.nextDouble();

                    Employee emp = new Employee();
                    emp.setName(name);
                    emp.setDepartment(dept);
                    emp.setSalary(salary);

                    dao.saveEmployee(emp);
                    System.out.println("Employee added!");
                }

                case 2 -> dao.getAllEmployees().forEach(System.out::println);

                case 3 -> System.out.println("Exiting...");

                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 3);
    }
}
