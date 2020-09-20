package com.factory.abstractfactory;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (type.equalsIgnoreCase("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (type.equalsIgnoreCase("clam")) {
            pizza = new NYStyleClamPizza();
        } else if (type.equalsIgnoreCase("veggie")) {
            pizza = new NYStyleVeggiePizza();
        }

        return pizza;
    }
}
