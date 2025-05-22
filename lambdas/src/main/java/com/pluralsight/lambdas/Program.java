package com.pluralsight.lambdas;

import java.util.ArrayList;
import java.util.List;

public class Program {


    public static void printEmployee(Employee employee){
        System.out.println("My salary is: " + employee.getSalary());
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ezra", "Actor", 72750.0));
        employees.add(new Employee("Ian", "Banker", 252750.0));
        employees.add(new Employee("Siddalee", "Model", 1500000.0));
        employees.add(new Employee("Elisha", "Programmer", 103500.0));
        employees.add(new Employee("Pursalane", "Teacher", 697250.0));
        employees.add(new Employee("Zephaniah", "Engineer", 136000.0));

        //passing a full method
        employees.forEach(Program::printEmployee);

        //passing an inline method (lambda)
        employees.forEach( employee -> System.out.println("My salary in a lambda is:" + employee.getSalary()));


    }



}
