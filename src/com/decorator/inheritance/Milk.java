package com.decorator.inheritance;

public class Milk extends DecoratorCondiment {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        double price = 0;
        switch(this.beverage.getSize()) {
            case TALL:      price = 0.3; break;
            case GRANDE:    price = 0.2; break;
            case VENTI:     price = 0.1; break;
        }
        return this.beverage.cost() + price;
    }

    @Override
    public Size getSize() {
        return this.beverage.getSize();
    }
}
