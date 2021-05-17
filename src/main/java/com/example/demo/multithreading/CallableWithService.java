package com.example.demo.multithreading;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class CallableWithService {
    static ExecutorService executorService = Executors.newSingleThreadExecutor();
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        callableWithFuture();
    }
    public static void callableWithFuture() throws ExecutionException, InterruptedException {
        Callable<String> callable = () -> {
            System.out.println("Callable threads");
            Thread.sleep(2000);
            return "Hello from callable";
        };

        Callable<String> callable1 = () ->{
          Thread.sleep(2000);
          return "Result from callable one";
        };

        Callable<String> callable2 = () ->{
            Thread.sleep(2000);
            return "Result from callable two";
        };
        List<Callable<String>> taskList = Arrays.asList(callable, callable1, callable2);
        List<Future<String>> futures = (List<Future<String>>) executorService.invokeAll(taskList);
        //Future<String> future = executorService.submit(callable);
        System.out.println("Perform another task");
        for (Future<String> key:futures){
            System.out.println(key.get());
        }
        executorService.shutdown();
    }
}
