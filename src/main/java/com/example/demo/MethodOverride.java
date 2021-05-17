package com.example.demo;

public class MethodOverride {
    public static void main(String[] args){
        Animal animal = new Animal();
        animal.makeNoise();
        Cat cat = new Cat();
        cat.makeNoise();
    }
}

class Animal{
    void makeNoise(){
        System.out.println("Animal makes noise.");
    }
    void animalEat(){
        System.out.println("Animal eats!");
    }
}

class Dog extends Animal{
    @Override
    void makeNoise() {
        System.out.println("Dog makes noise.");
    }
}
class Cat extends Animal{
    void makeNoise(){
        System.out.println("Cat makes noise.");
    }
}