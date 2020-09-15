package com.factory.factorypattern;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        pizzaName = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}
