package com.example.demo;

public class Employee {
    //hire a new employee
    String empName;
    String empId;
    String empDept;
    String empOfficeLocation;
    public static void main(String[] args){
        Employee empOne = new Employee();
        System.out.println(empOne);
    }
}


class Organization{
    String department;
    String officeLocation;
    Employee employeeList;
}
