package com.pluralsight.lambdas;

public class Employee {
    private String name;
    private String jobTitle;
    private double salary;
    public Employee(String name, String jobTitle,
                    double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}