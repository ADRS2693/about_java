package com.example.demo.multithreading;

import java.util.concurrent.Callable;

public class CallableTest {
    public static void main(String [] args){
        int[] trues = {7,1,7,7};
        int[] falses = {1,1,1,1};
        int[] halfTrue = {7,1,7,1};
        int[] halveTrue = {7,7,1,1};
        int[] testOne = {1,7,7};
        int[] testTwo = {1,7,1,7};
        int[] testThree = {1,7,1,1,7};
        CallableTest ct = new CallableTest();
        System.out.println(ct.has77(trues));
        System.out.println(ct.has77(falses));
        System.out.println(ct.has77(halfTrue));
        System.out.println(ct.has77(halveTrue));
        System.out.println(ct.has77(testOne));
        System.out.println(ct.has77(testTwo));
        System.out.println(ct.has77(testThree));
    }
    public boolean has77(int[] arr){
        Callable<Boolean> callable77 = new Callable<Boolean>() {
            @Override
            public Boolean call() throws Exception {
                for(int i = 0; i<arr.length-1; i++){
                    if(arr[i] == 7 && arr[i+1] == 7) return true;
                }
                return false;
            }
        };
        Callable<Boolean> callable717 = new Callable<Boolean>() {
            @Override
            public Boolean call() throws Exception {
                for (int i = 0; i<arr.length-2; i++){
                    if (arr[i] ==7 && arr[i+1] != 7 && arr[i+2] == 7) return true;
                }
                return false;
            }
        };
        try {
            if (callable77.call() || callable717.call()) return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean has12(int[] arr){
        Callable<Boolean> callable1 = new Callable<Boolean>() {
            @Override
            public Boolean call() throws Exception {
                for (int i = 0; i < arr.length; i++){
                    if (arr[i] == 1) {
                        for(int j = i; j < arr.length; j++){
                            if(arr[j] == 2){
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
        };
        return false;
    }
}
