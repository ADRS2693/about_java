package com.example.demo.multithreading;

import java.util.concurrent.Callable;

public class CallableThread {
    public static void main(String[] args){
        CallableThread callableThread = new CallableThread();
        try{
            String message = callableThread.callable.call();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    Callable<String> callable = new Callable() {
        @Override
        public Object call() throws Exception {
            return "This is a thread collection object";
        }
    };

    Callable<String> callableString = () -> {
        return "This is thread lambda callable object.";
    };
}
