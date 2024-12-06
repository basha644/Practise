package com.corestocy.oop;

// A class demonstrating encapsulation
class Employee {
    // Private fields (data is hidden)
    private String name;
    private int age;
    private double salary;

    // Public getter and setter methods to access private fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) { // Adding basic validation
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) { // Adding basic validation
            this.salary = salary;
        } else {
            System.out.println("Salary must be non-negative!");
        }
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Employee emp = new Employee();

        // Using setters to set values
        emp.setName("John Doe");
        emp.setAge(30);
        emp.setSalary(50000);

        // Using getters to get values
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Age: " + emp.getAge());
        System.out.println("Employee Salary: " + emp.getSalary());
    }
}

