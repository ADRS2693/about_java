package com.example.demo;

public class dealership extends Car{
    public dealership(String brand, String carName, String carMotor, String carColor) {
        super(carName, carMotor, carColor, brand);
    }
    public static void main(String[] args){
        dealership deel = new dealership("Tesla", "x", "double", "black");

    }
}
