package com.example.demo;

public class Car {
    private String name = "";
    private String motor = "";
    private String color= "";
    private String model = "";
    public Car(String carName, String carMotor, String carColor, String carModel){
        name = carName;
        motor = carMotor;
        color = carColor;
        model = carModel;
    }
    public String getName(){
        return name;
    }
    public String getMotor(){
        return motor;
    }
    public String getColor(){
        return color;
    }
    public String getModel(){
        return model;
    }
    public static void main(String[] args){
        //Car car = new Car("x", "single ", "black");
    }
}
