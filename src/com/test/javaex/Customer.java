package com.test.javaex;

public class Customer {

    public static void main(String[] args) {

        PizzaFactory pizzaFactory =new CheesePizzaStore();

        Pizza p=pizzaFactory.createPizza();
 String s=p.prepare();
 System.out.println(s);

    }
}
