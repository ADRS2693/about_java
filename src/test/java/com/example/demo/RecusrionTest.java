package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class RecusrionTest {
    int[] arr = new int[10];
    public static void main (String[] args){
        RecusrionTest test = new RecusrionTest();
        test.recursive1To10(1, 0);
    }
    public String recursive1To10(int number, int index){
        //This code prints the sequence from the given number to 10 without using loops
        //if (n > 10) break;
        arr[index] = number;
        //recursive calls itself until it reaches 10
        if (number < 10){
            recursive1To10(number+1, index+1);
        }
        else{
            System.out.println(Arrays.toString(arr));
        }
        return Arrays.toString(arr);
    }
    @Test
    public void testRecursive1To10(){
        Assertions.assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]",recursive1To10(1,0));
    }
}
