package com.example.demo.list;
import java.util.*;

public class ArrayVArrayList {
    public static void main(String[] args) {
        //double [] number = {12.99, 56.89, 57.69};
        String[] arr = ListToArray();
        System.out.println(Arrays.toString(arr));
    }

    static void aboutArrayList(){
        double[] number = new double[3];

        number[0] = 12.99;
        number[1] = 56.89;
        number[2] = 57.69;

        System.out.println(Arrays.toString(number));

        ArrayList<Double> num = new ArrayList<>();
        System.out.println(0);
        num.add(12.99);
        num.add(56.99);
        num.add(57.69);

        System.out.println(num.size());

        System.out.println(num);

        System.out.println(num.indexOf(12.99));

        System.out.println(num.get(1));

        System.out.println(num.remove(1));

        System.out.println(num);

        System.out.println(num.contains(56.99));

        num.add(1, 18.99);

        System.out.println(num);
    }

    static String[] ListToArray(){
        List<String> al =  new ArrayList<>();
        al.add("One");
        al.add("Two");
        al.add("Three");
        al.add("Four");
        al.add("Five");

        String[] arr = new String[al.size()];

        /* for (int i = 0; i< al.size(); i++){
            arr[i] = (String) al.get(i);
        }*/

        al.toArray(arr);

        return arr;
    }

    static void ArrayIntoList(){
        String[] array = {"a", "b", "c", "d", "e"};
        ArrayList<String> charLis = new ArrayList<>();
        Collections.addAll(charLis, array);
    }
}
