package com.example.demo;

public class ABC_Corp {
    public static void main(String[] args){
        Collab_Employee employeeOne = new Collab_Employee();
        employeeOne.setEmpID(10);
        employeeOne.setFirstName("Josh");
        employeeOne.setLastName("Wilson");
        employeeOne.setIncome(10100);
        employeeOne.setActive(true);

        Collab_Employee employeeTwo = new Collab_Employee();
        employeeTwo.setEmpID(102);
        employeeTwo.setFirstName("Bob");
        employeeTwo.setLastName("Bobberson");
        employeeTwo.setActive(false);
        employeeTwo.setIncome(100000000);
    }
}
