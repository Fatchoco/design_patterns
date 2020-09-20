package com.factory.abstractfactory;

public class Main {
    public static void main(String[] args) {
        PizzaStore ps = new NYStylePizzaStore();

        Pizza pizza1 = ps.orderPizza("cheese");
        System.out.println(pizza1.getPizzaName());
        System.out.println(" ");
        Pizza pizza2 = ps.orderPizza("veggie");
        System.out.println(pizza2.getPizzaName());
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        ps = new ChicagoStylePizzaStore();

        pizza1 = ps.orderPizza("cheese");
        System.out.println(pizza1.getPizzaName());
        System.out.println(" ");
        pizza2 = ps.orderPizza("veggie");
        System.out.println(pizza2.getPizzaName());
    }
}
