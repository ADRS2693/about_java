package com.example.demo.Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericComparison {
    public static void main(String[] args) {
        ObjectPair<Integer, String> pair1 = new ObjectPair<>(1, "Apple");
        ObjectPair<Integer, String> pair2 = new ObjectPair<>(2, "Pear");
        boolean result = ObjectCompare.compare(pair1, pair2);
        System.out.println(result);

        List<String> names = new ArrayList<>();
        names.add("java");
        names.add("c++");
        names.add("javascript");


        ObjectCompare.contains(names.toArray(), "java");
    }
}

class ObjectCompare{
    //compare to objects and return true or false
    public static <K,V> boolean
    compare(ObjectPair < K, V> p1, ObjectPair<K,V> p2){
        return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
    }
    public static final <T> boolean contains (final T[] array, final T v){
        for (final T e: array){
            if (e==v || v != null && v.equals(e)){
                return true;
            }
        }
        return false;
    }
}


    class ObjectPair<K,V>{
        private K key;
        private V value;

        public ObjectPair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }

