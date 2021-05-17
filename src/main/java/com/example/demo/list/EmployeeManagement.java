package com.example.demo.list;

import java.util.ArrayList;
import java.util.Comparator;

public class EmployeeManagement {

    static ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String[] args){
        addEmployee(makeEmployee(100, "Ecce", "Art", 100.00, false));
        addEmployee(makeEmployee(101, "Bravo", "Art", 100.00, true));
        addEmployee(makeEmployee(102, "Son", "Art", 100.00, false));
        addEmployee(makeEmployee(103, "Chill", "Art", 100.00, true));
        addEmployee(makeEmployee(104, "Memelord", "Meme", 45.00, false));
        System.out.println(employees);
        sortById();
        getNameAndID();
    }



    static Employee makeEmployee(int id, String name, String dept, Double income, boolean active){
        Employee employee = new Employee();
        employee.setEmpID(id);
        employee.setEmpName(name);
        employee.setEmpDept(dept);
        employee.setEmpIncome(income);
        employee.setIncome(active);
        return employee;
    }

    static void addEmployee(Employee employee){
        employees.add(employee);
    }

    static void getNameAndID(){
      employees.forEach(employee -> System.out.println("Name: " + employee.getEmpName() + " Dept: " + employee.getEmpDept()));
    }

    static void sortById(){
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                return Integer.compare(emp1.getEmpID(), emp2.getEmpID());
            }
//                if (emp1.getEmpID() == emp1.getEmpID()){
//                    return 0;
//                }
//                else if (emp1.getEmpID() >= emp2.getEmpID()){
//                    return 1;
//                }
//                else return -1;
//            }
        });
    }


}
