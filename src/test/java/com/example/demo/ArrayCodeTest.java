package com.example.demo;

import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArrayCodeTest {
    public int countEvens(int[] arr){
        /*
            return the number of even ints in the given array
        */
        int count = 0;
        int counted = 0;
        for (int i = 0; i < arr.length; i++) if ((arr[i] % 2 == 0)) count++;
        return count;
    }
    public boolean sum28(int[] arr){
        /*
            return the number of even ints in the given array
        */
            int count = 0;
            for (int i = 0; i < arr.length; i++) if ((arr[i] == 2)) count+=2;
            return (count ==8) ? true: false;
        }
        public int[] zeroFront(int[] array){
            int[] arr = array;
            Arrays.stream(arr).iterator();
            for (int i = 0; i<arr.length; i++){
                if (arr[i] == 1){
                    int j =1;
                    while (j < arr.length){
                        if (arr[j] == 0){
                            arr[j] = arr[i];
                            arr[i] = 0;
                        }
                        j++;
                    }
                }
            }
            return arr;
        }
    @Test
    public void testCountEvens(){
        int[] arrOne = {1,2,3,4,5,6};
        Assertions.assertEquals(3, countEvens(arrOne));
        Assertions.assertEquals(3, countEvens(new int[]{0, 2, 2}));
        Assertions.assertEquals(4, countEvens(new int[] {2,2,2,267570}));
        assertEquals(false,sum28(arrOne));
        assertEquals(true, sum28(new int[] {2,2,2,2}));
        assertEquals(true, sum28(new int[] {1,2,3,2,5,2,7,2}));
        assertEquals(new int[] {0,0,1,1}, zeroFront(new int[]{1,1,0,0}));
    }
}
