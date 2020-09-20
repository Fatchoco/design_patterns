package com.factory.abstractfactory;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (type.equalsIgnoreCase("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setPizzaName("New York Style Cheese Pizza");
        } else if (type.equalsIgnoreCase("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setPizzaName("New York Style Clam Pizza");
        } else if (type.equalsIgnoreCase("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setPizzaName("New York Style Veggie Pizza");
        }

        return pizza;
    }
}
