package com.example.demo;

public class IntrotoInheritace extends Person{
    public IntrotoInheritace(String pName, int pAge){
        super (pName,pAge);
    }
}

class Person{
    String name;
    int age;

    public Person(String pName, int pAge) {
        name = pName;
        age = pAge;
    }

    void getPersonInfo(){
        System.out.println(name);
        System.out.println(age);
    }

    public void setAge(int age) {
        this.age = age;
    }
}
