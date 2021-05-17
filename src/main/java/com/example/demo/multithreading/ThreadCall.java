package com.example.demo.multithreading;

public class ThreadCall {
    public static void main(String[] args) {
    ThreadOne one = new ThreadOne();
    one.start();
    ThreadTwo two = new ThreadTwo();
    two.run();
    RunWithClass three = new RunWithClass();
    three.runnable.run();
    three.runnableTwo.run();
    three.runnableThree.run();
    }
}

class ThreadOne extends Thread{
    public void run(){
        System.out.println("Inside: " + Thread.currentThread().getName());
    }
}
class ThreadTwo implements Runnable{
    @Override
    public void run() {
        System.out.println("Inside Thread Two : " + Thread.currentThread().getName());
    }
}
class RunWithClass{
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("Inside Thread Runnable : " + Thread.currentThread().getName());
        }
    };
    Runnable runnableTwo = () -> {
        System.out.println("Inside Thread with lambda : " + Thread.currentThread().getName());
    };

    String[] names = {
        "Mike", "Jack", "Josh", "Bob"
    };

    Runnable runnableThree = () -> {
        System.out.println("Inside String Loop : " + Thread.currentThread().getName());
        for(String name: names){
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
                e.getMessage();
            }
        }
    };
}
