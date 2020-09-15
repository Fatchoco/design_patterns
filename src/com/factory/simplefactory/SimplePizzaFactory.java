package com.factory.simplefactory;

public class SimplePizzaFactory {
    private Pizza pizza;

    public Pizza createPizza(String type) {
        if (type.equalsIgnoreCase("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equalsIgnoreCase("clam")) {
            pizza = new ClamPizza();
        } else if (type.equalsIgnoreCase("veggie")) {
            pizza = new VeggiePizza();
        } else {
            pizza = new Pizza();
        }
        return pizza;
    }
}
