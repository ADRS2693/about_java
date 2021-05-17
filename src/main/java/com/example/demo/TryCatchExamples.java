package com.example.demo;

public class TryCatchExamples {
    public static void main(String[] args){
        int number = 10;
        try{
            for (int i = 10; i>0; i--){
                System.out.println(number + "/" + i + " = " + number/i);
                number*=10;
            }
        }
        catch (Exception e){
            System.out.println("No dividing by zero!");
            return;
        }
        finally{
            System.out.println("That's all folks!");
        }
    }
}
