package com.example.demo.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        System.out.println(usernames());
    }

    public static void withoutStream(List<String> list){
        for (String name: usernames()){
            if (name.length() <= 5) System.out.println(name);

        }
    }

    public static void withStream(){
        List<String> result = usernames().stream().filter(name -> name.length() <= 4).collect(Collectors.toList());
        System.out.println(result);
    }

    public static void getCount(){
        Stream.iterate(1, count -> count +1).filter((num -> num%2 ==0)).limit(6).forEach(System.out::println);
    }

    public static List<String> usernames(){
        List<String> userNameList = new ArrayList<>();
        userNameList.add("Bob");
        userNameList.add("Neal");
        userNameList.add("Jacob");
        userNameList.add("Mark");
        userNameList.add("Denny");
        userNameList.add("Susan");
        return userNameList;
    }
}
