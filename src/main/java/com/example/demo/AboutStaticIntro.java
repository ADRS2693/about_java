package com.example.demo;

public class AboutStaticIntro {
    static boolean isActive;
    static float price;
    static {
        isActive = true;
        price = 12.89F;
    }
    static String name;
    String someName;
    public static void main(String[] args){
        System.out.println(isActive);
        AboutStaticIntro intro = new AboutStaticIntro();
        intro.someName = "non static value";

    }
}
