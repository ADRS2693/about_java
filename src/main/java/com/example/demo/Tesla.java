package com.example.demo;

public class Tesla extends dealership{
    public Tesla(String brand, String carName, String carMotor, String carColor) {
        super(brand, carName, carMotor, carColor);
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public String getMotor() {
        return super.getMotor();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }
}
