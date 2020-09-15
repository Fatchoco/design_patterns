package com.factory.simplefactory;

public class Main {
    public static void main(String[] args) {
        PizzaStore ps = new PizzaStore();

        Pizza pizza1 = ps.orderPizza("cheese");
        System.out.println(pizza1.getPizzaName());
        Pizza pizza2 = ps.orderPizza("veggie");
        System.out.println(pizza2.getPizzaName());
    }
}
