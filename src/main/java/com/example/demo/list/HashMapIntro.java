package com.example.demo.list;

import java.util.HashMap;
//import java.util.Iterator;
import java.util.Map;

public class HashMapIntro extends EmployeeManagement{
    //static Map<Integer, String> dataList = new HashMap<>();
    static Map<Integer, Employee> employees = new HashMap<>();
    public static void main(String[] args) {
        createEmpMap();
        printEmployees();
        printFirstName();
        printProfile();
    }
    /*
    static void mapTutorial() {
        System.out.println(dataList);
        dataList.put(11, "Java");
        dataList.put(12, "Javascript");
        dataList.put(13, "Python");
        dataList.put(14, "HTML");
        System.out.println(dataList);
        Iterator<Integer> iterator = dataList.keySet().iterator();

        //print the value of the keys
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            System.out.println("Key: " + key);
        }

        //print the value of the hashmap
        for (String value : dataList.values()) {
            System.out.println("Value: " + value);
        }

        //prints the keys and the values of a Hashmap
        Iterator<Map.Entry<Integer, String>> iterator1 = dataList.entrySet().iterator();
        while (iterator1.hasNext()) {
            Map.Entry<Integer, String> entry = iterator1.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
    */
    static void createEmpMap(){
        //creates the starter map to work with
        addEmployee(makeEmployee(100, "Ecce", "Meme", 100.00, true));
        addEmployee(makeEmployee(101, "Bob", "Bob's Department", 100.00, true));
        addEmployee(makeEmployee(102, "Ecce", "Meme", 100.00, false));
        addEmployee(makeEmployee(103, "E", "Brunj", 1000.00, true));
        addEmployee(makeEmployee(104, "Ecce", "Meme", 10000.00, false));
    }
    static void addEmployee(Employee emp){
        //adds an employee based on empID this is made under the assumption that the only time a
        // new employee will have a pre-established ID said ID will be for someone who doesn't work there
        employees.put(emp.getEmpID(), emp);
    }
    static void printEmployees(){
        //prints out the full employee map
        System.out.println(employees.toString());
    }

    static void  printFirstName(){
       //for (int i = 0; i<employees.size(); i++) {
        employees.forEach((inti, emp) -> {
           System.out.println(employees.get(inti).getEmpName());
       });
    }
    static void printProfile(){
        //Prints a list of employee name, income, if they are active
        employees.forEach((key, emp) ->{
            System.out.print(employees.get(key).getEmpName() + " ");
            System.out.print(employees.get(key).getEmpIncome() + " ");
            System.out.println(employees.get(key).getIncome() + " ");
        });
    }

}

