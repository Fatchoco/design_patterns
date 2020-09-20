package com.factory.abstractfactory;

import java.util.ArrayList;

public abstract class Pizza {
    protected String pizzaName = "Normal Pizza";
    protected String dough;
    protected String sauce;
    protected ArrayList<String> toppings = new ArrayList<String>();

    public void prepare() {
        System.out.println("Preparing " + pizzaName);
        System.out.println("   Tossing dough...");
        System.out.println("   Adding sauce...");
        System.out.println("   Adding Toppings:");
        for (String topping : toppings) {
            System.out.print(" " + topping);
        }
    };

    public void bake() {
        System.out.println("Baking pizza...");
    }

    public void cut() {
        System.out.println("Cutting pizza...");
    }

    public void box() {
        System.out.println("Boxing pizza...");
    };

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }
}
