package com.example.demo.exceptions;

public class IntroToExceptions {
    //Error and Exceptions
    public static void main(String[] args){
        try{
            //some code
        }
        catch(Exception e){
            e.getMessage();
        }
        finally{
            System.out.println("this is the finally block");
        }

        System.out.println("Code continue");
    }

    static void indexOutOfBounds(){
        try {
        int[] a = new int[5];
        int x = a[10];
        }
        catch (ArrayIndexOutOfBoundsException e){

        }
    }
}
