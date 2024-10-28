import java.util.Scanner;

class Employee {
    int empId;
    String empName;
    String empAddress;
    String empDesignation;
    double empSalary;

    void scanEmployeeDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Id: ");
        empId = sc.nextInt();

        sc.nextLine();  // to consume the \n character
        System.out.print("Enter Employee Name: ");
        empName = sc.nextLine();

        // sc.nextLine();
        System.out.print("Enter Employee Address: ");
        empAddress = sc.nextLine();

        // sc.nextLine();
        System.out.print("Enter Employee Designation: ");
        empDesignation = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        empSalary = sc.nextDouble();

        // sc.close();
    }

    void printEmployeeDetails() {
        System.out.println(empId + "\t" + empName + "\t" + empAddress + "\t" + empDesignation + "\t" + empSalary);
    }

}

public class Class_Object {
    public static void main(String[] args) {
        // Employee e = new Employee();

        // e.scanEmployeeDetails();
        // System.out.println("Employee Details: ");
        // System.out.println("Id\tName\tAddress\t\tDesignation\tSalary");
        // e.printEmployeeDetails();

        //data_type array_name = new data_type[size];
        Employee emp[] = new Employee[3];

        // instantiation of an array
        // emp[0] = new Employee();
        // emp[1] = new Employee();
        // emp[2] = new Employee();

        // emp[0].scanEmployeeDetails();
        // emp[1].scanEmployeeDetails();
        // emp[2].scanEmployeeDetails();

        // emp[0].printEmployeeDetails();
        // emp[1].printEmployeeDetails();
        // emp[2].printEmployeeDetails();

        for(int i = 0; i < 3; i++) {
            emp[i] = new Employee();
            System.out.println("Enter Employee " + (i+1) + " Details:\n");
            emp[i].scanEmployeeDetails();
        }

        System.out.println("Employee Details: ");
        System.out.println("Id\tName\tAddress\tDesignation\tSalary");
        for(int i = 0; i < 3; i++) {
            emp[i].printEmployeeDetails();
        }

    }
}

/*
Class: A class is a blueprint or a template of an object
Object: An instance of a class

Task:

Class Student:
attributes: rollNo, name, address, marks

scan and print the details of 6 students
*/