package com.factory.abstractfactory;

public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza() {
        pizzaName = "NY Style Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}
