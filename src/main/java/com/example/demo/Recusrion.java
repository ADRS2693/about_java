package com.example.demo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Recusrion {
    int[] arr = new int[100];
    public static void main (String[] args){
        Recusrion test = new Recusrion();
        test.recursive1To10(1, 0);
        System.out.println(test.count7(710265477));
        System.out.println(test.starString("bruh"));
        System.out.println(test.pairStar("ecce hommo"));
        System.out.println(test.pairStar("hello"));
        System.out.println(test.pairStar("xxyy"));
        System.out.println(test.pairStar("aaaa"));
    }
    public void recursive1To10(int number, int index){
        //This code prints the sequence from the given number to 10 without using loops
        //if (n > 10) break;
        arr[index] = number;
        //recursive calls itself until it reaches 10
        if (number < 100){
            recursive1To10(number+1, index+1);
        }
        else System.out.println(Arrays.toString(arr));
    }
    public int count7(int n){
        /*
        if (n == 0) return 0;
        if (n%10 == 7) return 1+count7(n/10);
        return count7(n/10);
        */
        return (n==0) ? 0:((n%10 ==7) ? 1+count7(n/10) : count7(n/10));
    }
    public String starString(String str){
        if(str.length() <= 1) return str;
        return str.charAt(0) + "*" + (starString(str.substring(1)));
    }
    public String pairStar(String str){
        if(str.length() <= 1) return str;
        return (str.charAt(0)==str.charAt(1)? (str.substring(0,1) + "*" + pairStar(str.substring(1, str.length()))) : (str.substring(0,1) + pairStar(str.substring(1, str.length()))));
    }
}
