package com.example.demo.multithreading;

public class IntroToThreading implements Runnable{
    public static void main(String[] args){
        System.out.println("This is a single thread.");
        Thread threadOne = new Thread("ThreadOne...");
        Thread threadTwo = new Thread("ThreadTwo");
        threadOne.start();
        threadTwo.start();
        System.out.println(threadOne.getName());
        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(threadTwo.getName());
    }

    @Override
    public void run() {

    }
}
