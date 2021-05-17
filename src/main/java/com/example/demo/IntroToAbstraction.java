package com.example.demo;

public class IntroToAbstraction extends User{
    public static void main(String[] args) {
        IntroToAbstraction introToAbstraction = new IntroToAbstraction();
        introToAbstraction.printInfo();
    }
    @Override
    void printInfo() {
        System.out.println("bruh");
    }
}
abstract class User{
    abstract void printInfo();
}
