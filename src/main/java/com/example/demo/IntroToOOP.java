package com.example.demo;

public class IntroToOOP {
    public IntroToOOP() {
        System.out.println("This is a no args constructor");
    }
    public IntroToOOP(String classname){
        System.out.println("This is args constructor");
    }

    String carModel;
    String carColor;
    String engineType;

    public IntroToOOP(String model, String color, String engine){
        carModel = model;
        carColor = color;
        engineType = engine;
    }
    public static void  main(String[] args){
        IntroToOOP constOne = new IntroToOOP("test");
    }
}
