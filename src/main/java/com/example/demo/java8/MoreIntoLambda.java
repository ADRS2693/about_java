package com.example.demo.java8;

import java.util.ArrayList;
import java.util.List;

public class MoreIntoLambda {
    public static void main(String[] args) {
        TaskOne taskOne = () -> Math.random() + 1;

        double price = taskOne.sumOfNumber();
        System.out.println(price);

        TaskTwo taskTwo = (n, m) -> n + " " + m;

        String fullName = taskTwo.printName("Anthony" , "Redondo");
        System.out.println(fullName);

        TaskThree taskThree = ()-> {
            System.out.println("Printed by the third interface");
        };
        taskThree.printVoid();
    }

    public static void getNames(){
        List<String> names = new ArrayList<>();
        names.add("Mike");
        names.add("James");
        names.add("Mike");
        names.forEach((name) -> System.out.println(name));
    }

}

@FunctionalInterface
interface TaskOne{
    double sumOfNumber();
}

@FunctionalInterface
interface TaskTwo{
    String printName (String firstname, String lastname);
}

@FunctionalInterface
interface TaskThree{
    void printVoid();
}