package com.factory.simplefactory;

public class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza;

        if (type.equalsIgnoreCase("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equalsIgnoreCase("clam")) {
            pizza = new ClamPizza();
        } else if (type.equalsIgnoreCase("veggie")) {
            pizza = new VeggiePizza();
        } else {
            pizza = new Pizza();
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
