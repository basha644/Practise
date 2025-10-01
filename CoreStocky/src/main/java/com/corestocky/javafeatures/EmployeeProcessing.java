package com.corestocky.javafeatures;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

class Employee{
     private String deparatment;
     private String id;
     private double salary;

     public Employee(String name, String id, double salary) {
         this.deparatment = name;
         this.id = id;
         this.salary = salary;
     }

     public String getDeparatment() {
         return deparatment;
     }

     public void setDeparatment(String deparatment) {
         this.deparatment = deparatment;
     }

     public String getId() {
         return id;
     }

     public void setId(String id) {
         this.id = id;
     }

     public double getSalary() {
         return salary;
     }

     public void setSalary(double salary) {
         this.salary = salary;
     }

     @Override
     public String toString() {
         return "Employee{" +
                 "name='" + deparatment + '\'' +
                 ", id='" + id + '\'' +
                 ", salary='" + salary + '\'' +
                 '}';
     }
 }
public class EmployeeProcessing {
    public static void main(String[] args) {
       List<Employee> employees = Arrays.asList(new Employee("IT","1",10), new Employee("MEC","2",20),
               new Employee("Infra","3",30));

       Consumer<Employee> salaryIncrease = (emp) -> emp.setSalary(emp.getSalary()*10.5);

       Predicate<Employee> higherSalary = (emp)-> emp.getSalary() >12;

       Predicate<Employee> filterDepart = (emp) -> "IT".equals(emp.getDeparatment());

       employees.forEach(salaryIncrease);

       employees.stream().filter(higherSalary).forEach(System.out::println);
    }


}
