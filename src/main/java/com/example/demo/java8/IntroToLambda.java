 package com.example.demo.java8;

public class IntroToLambda {
    public static void main(String[] args) {
        printInfo("Print something...");

        MyInterface myInterface = () -> {
            return "String from lambda";
        };
    }

    /*
    Method
    1.) Name
    2. Args list/no Args
    3. Body
    4. return type/ void

    Lambda:
    1. No name
    2. Args, Lists, or no Args
    3. Body
    4. Return type
       (args) -> (body)
       //Functional interface (must have only one abstract method)
     */

    public static void printInfo(String message){
        System.out.println(message);
    }

    @FunctionalInterface
    interface MyInterface{
        String getInfo();
    }

}
