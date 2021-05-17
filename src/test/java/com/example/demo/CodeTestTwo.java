package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CodeTestTwo {
    public boolean in3050(int x, int y){
        /*
        if(x>=30 && x<=40 && y >= 30 && y <= 40){
            return true;
        }
        if (x>=40 && x<=50 && y>=40 && y <= 50){
            return true;
        }
        else return false;*/
        //returns if the numbers are in the range of 30-40 or 40-50, inclusive
        return (x>=30 && x<=40 && y >= 30 && y <= 40) || (x>=40 && x<=50 && y>=40 && y <= 50);
    }
    @Test
    public void testIn3050(){
        Assertions.assertEquals(true, in3050(30, 40));
        Assertions.assertEquals(false, in3050(30, 41));
        Assertions.assertEquals(true, in3050(40, 50));
    }
}
