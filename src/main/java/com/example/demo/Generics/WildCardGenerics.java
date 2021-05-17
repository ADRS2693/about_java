package com.example.demo.Generics;

import java.util.*;

public class WildCardGenerics {

    public static void printCollection(List<?> collections){
        for (Object obj: collections) {
            System.out.println(obj);
        }
    }

    public static void printMap(Map<?,?> map){
        Iterator<?> iterator = map.entrySet().iterator();
        while ( iterator.hasNext()){
            Map.Entry<?,?> entry = (Map.Entry<?, ?>) iterator.next();
            System.out.println(entry);
        }
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("WildCard");
        printCollection(stringList);

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(5.99);
        printCollection(doubleList);

        Map<Integer, String> map = new HashMap<>();
        map.put(45, "Chaos Budgie");
        map.put(66, "Victor's Wallet");
        printMap(map);

        Map<String, Boolean> map1 = new HashMap<>();
        map1.put("Anthony", true);
        map1.put("Rodolfo", false);

    }
}
