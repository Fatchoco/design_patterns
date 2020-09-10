package com.decorator.inheritance;

public class Whip extends DecoratorCondiment{
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 0.1;
    }

    @Override
    public Size getSize() {
        return this.beverage.getSize();
    }
}
