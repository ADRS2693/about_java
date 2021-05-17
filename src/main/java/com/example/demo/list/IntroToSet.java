package com.example.demo.list;

import java.util.HashSet;

public class IntroToSet {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<String>();
        names.add("One");
        names.add("Two");
        names.add("One");
        System.out.println(names);
    }
}
