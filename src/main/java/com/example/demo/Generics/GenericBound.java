package com.example.demo.Generics;

public class GenericBound {
    public static void main(String[] args) {
    Price<Integer> price = new Price<>();
    price.setPrice(12);
    }
}

class Price<T extends Number>{
    private T price;

    public T getPrice() {
        return price;
    }

    public void setPrice(T price) {
        this.price = price;
    }
    public  <V extends Number> void checkThePriceDataType(V value){
        System.out.println("T:" + price.getClass().getName());
        System.out.println("V: " + price.getClass().getName());
    }
    public boolean checkOOE(){
        return ((price.intValue()%2 == 0));
    }
}