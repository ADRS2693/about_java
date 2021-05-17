package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Will require you to use ArrayList or Set
 * You can use lambda to provide a solution
 */
public class ListObjectTest {
    /*
    Given a list of integers return a list where each integer is multiplied by 2
     */

    public List<Integer> doubling(List<Integer> nums){
//        int i = 0;
//        for (Integer number: nums){
//            nums.set(i, number*2);
//            i++;
//        }
        nums.replaceAll( n -> n*2);
        return nums;
    }

    public List<String> copies3(List<String> arr){
        arr.replaceAll(s -> s+s+s);
        return arr;
    }

    ArrayList<Integer> test;
    ArrayList<Integer> test2;
    ArrayList<String> test3;
    ArrayList<String> test4;

    @Test
    public void doubleTheNumbers(){
        test = new ArrayList<>(Arrays.asList(1, 2, 3));
        test2 = new ArrayList<>(Arrays.asList(2, 4, 6));
        Assertions.assertEquals(test2, doubling(test));
        test = new ArrayList<>(Arrays.asList(8,6,8,6,8,-1));
        test2 = new ArrayList<>(Arrays.asList(16,12,16,12,16,-2));
        Assertions.assertEquals(test2, doubling(test));
        test = new ArrayList<>(Arrays.asList());
        test2 = new ArrayList<>(Arrays.asList());
        Assertions.assertEquals(test2, doubling(test));

    }

    @Test
    public void tripleTheStrings(){
        test3 = new ArrayList<>(Arrays.asList("a", "bb", "ccc"));
        test4 = new ArrayList<>(Arrays.asList("aaa", "bbbbbb", "ccccccccc"));
        Assertions.assertEquals(test4, copies3(test3));
        test3 = new ArrayList<>(Arrays.asList("24", "a", ""));
        test4 = new ArrayList<>(Arrays.asList("242424", "aaa", ""));
        Assertions.assertEquals(test4, copies3(test3));
        test3 = new ArrayList<>(Arrays.asList("hello", "there"));
        test4 = new ArrayList<>(Arrays.asList("hellohellohello", "theretherethere"));
        Assertions.assertEquals(test4, copies3(test3));

    }

}
