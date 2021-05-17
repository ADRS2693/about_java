package com.example.demo.Generics;

public class IntroToJavaGenerics {

    /*

     */
    public static void main(String[] args) {
        Product<String> product = new Product<>("Some ID");
        Product<Boolean> product2 = new Product<>(true);
        Product<Integer> integerProduct = new Product<>(45);

        System.out.println(product.getProdID() + "\n" + product2.getProdID() + "\n" + integerProduct.getProdID());

        TestDemo<String, String> testDemo1 =new TestDemo<>("Ecce", "Homo");
        TestDemo<Integer, String> testDemo2 = new TestDemo<>();
        testDemo2.setTestOne(45);
        testDemo1.setTestOne("Budgie");
        System.out.println(testDemo1.getTestOne() + " " + testDemo1.getTestTwo());
        System.out.println(testDemo2.getTestOne() + " " + testDemo2.getTestTwo());
    }
}

class Product<T>{
    private T prodID;
    public Product(T id){
        prodID = id;
    }
    public T getProdID() {
        return prodID;
    }

    public void setProdID(T prodID) {
        this.prodID = prodID;
    }
}

class TestDemo <T1, T2>{
   private T1 testOne;
   private T2 testTwo;

    public TestDemo() {

    }

    public T1 getTestOne() {
        return testOne;
    }

    public void setTestOne(T1 testOne) {
        this.testOne = testOne;
    }

    public T2 getTestTwo() {
        return testTwo;
    }

    public void setTestTwo(T2 testTwo) {
        this.testTwo = testTwo;
    }

    public TestDemo(T1 testOne, T2 testTwo) {
        this.testOne = testOne;
        this.testTwo = testTwo;
    }
}
