package com.factory.simplefactory;

public class Pizza {
    private String pizzaName = "Normal Pizza";

    public void prepare() {
        System.out.println("Preparing pizza...");
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
}
