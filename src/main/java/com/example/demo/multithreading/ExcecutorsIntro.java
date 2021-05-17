package com.example.demo.multithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExcecutorsIntro {
    public static void main(String[] args) {

    }
    public static void aboutExcecutor(){
        System.out.println("Inside: " + Thread.currentThread().getName());
        System.out.println("Executor basics...");

        ExecutorService service = Executors.newSingleThreadExecutor();

        System.out.println("Creating runnable");
        Runnable runnable = () -> {
            System.out.println("Inside Runnable: " + Thread.currentThread().getName());
        };
        service.submit(runnable);

        service.shutdown();
    }

    public static void aboutExecutorService(){
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Runnable runnableOne = () -> {
            System.out.println("Running Thread One: " + Thread.currentThread().getName());
            try{
                TimeUnit.SECONDS.sleep(2);
            }
            catch (InterruptedException e){
                e.getMessage();
            }
        };
        Runnable runnableTwo = () -> {
            System.out.println("Running Thread Two: " + Thread.currentThread().getName());
            try{
                TimeUnit.SECONDS.sleep(4);
            }
            catch (InterruptedException e){
                e.getMessage();
            }
        };
        Runnable runnableThree = () -> {
            System.out.println("Running Thread Three: " + Thread.currentThread().getName());
            try{
                TimeUnit.SECONDS.sleep(6);
            }
            catch (InterruptedException e){
                e.getMessage();
            }
        };
    }
}
