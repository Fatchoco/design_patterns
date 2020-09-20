package com.factory.abstractfactory;

public class NYStyleClamPizza extends Pizza {
    public NYStyleClamPizza() {
        pizzaName = "NY Style Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}
