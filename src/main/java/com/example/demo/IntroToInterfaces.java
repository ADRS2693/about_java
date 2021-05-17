package com.example.demo;

import java.io.Serializable;

public class IntroToInterfaces implements DemoInterface, Serializable {
    /*
    Things not in Interface
        bodies in the interface methods
        constructors
        must not create an object

    Things in an interface
        methods are public an abstract
        static exist but isn't practical
        you can implement various interfaces
     */

    @Override
    public void bruh() {
        System.out.println("Bruh!");
    }
    public static void main(String[] args){
        DemoInterface.printInfo();
    }
}

interface DemoInterface{
    void bruh();
    public static void printInfo(){
        System.out.println("son");
    }
}