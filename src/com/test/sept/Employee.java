package com.test.sept;

public class Employee {

    private String empname;
    private double salary;

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String empname, double salary) {
        this.empname = empname;
        this.salary = salary;
    }
}
