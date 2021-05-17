package com.example.demo.java8;

public class IntroMethodReference {
    public static void main(String[] args) {
        IntroMethodReference reference = new IntroMethodReference();
        reference.myDisplayMethod();

        MethodRef ref = reference::myDisplayMethod;;
        ref.display();
    }
    void myDisplayMethod(){
        System.out.println("My Display Method");
    }
}

interface  MethodRef{
    void display();
}
