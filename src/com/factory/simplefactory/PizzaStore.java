package com.factory.simplefactory;

public class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza;
        SimplePizzaFactory pf = new SimplePizzaFactory();

        pizza = pf.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
