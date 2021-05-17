package com.example.demo.exceptions;

import java.io.IOException;

public class ThrowVSThrows {
    public static void main(String[] args){
        checkEligibility(15, 44);
        ThrowsDemo td = new ThrowsDemo();
        try {
            td.myMethod(45);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    static void checkEligibility(int age, int weight){
       //student min 12 age and 40 pounds
       if (age< 12 && weight<40){
           System.out.println("Student is eligible");
       }
       else throw new ArithmeticException("Student age or weight is not acceptable");
    }
}

class ThrowsDemo{
    void myMethod(int num) throws IOException, ClassNotFoundException{
        if(num %2 == 0) {
            throw new IOException("Number is even therefore IOException");
        }
        else throw new ClassNotFoundException("Number is odd thus Class not Found");
    }
}

class MyCustomException extends ArithmeticException{
    MyCustomException(String message){
        super(message);
    }
}