package com.factory.factorypattern;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (type.equalsIgnoreCase("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equalsIgnoreCase("clam")) {
            pizza = new ChicagoStyleClamPizza();
        } else if (type.equalsIgnoreCase("veggie")) {
            pizza = new ChicagoStyleVeggiePizza();
        }

        return pizza;
    }
}
