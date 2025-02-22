package com.test.javaex;

public class CheesePizzaStore implements PizzaFactory{
    @Override
    public Pizza createPizza() {
        return new ChesePizza();
    }
}
