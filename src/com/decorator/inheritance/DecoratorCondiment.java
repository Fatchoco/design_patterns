package com.decorator.inheritance;

public abstract class DecoratorCondiment extends Beverage {
    @Override
    public abstract String getDescription();

    @Override
    public abstract Size getSize();
}
