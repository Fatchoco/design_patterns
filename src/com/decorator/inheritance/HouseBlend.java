package com.decorator.inheritance;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend";
    }

    @Override
    public double cost() {
        double price = 0;
        switch(this.size) {
            case TALL:      price = 1.9; break;
            case GRANDE:    price = 1.5; break;
            case VENTI:     price = 1.2; break;
        }
        return price;
    }
}
