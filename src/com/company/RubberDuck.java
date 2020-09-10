package com.company;

public class RubberDuck extends BaseDuck {
    public RubberDuck() {
        this.flyBehaviour = new FlyNoWay();
        this.quackBehaviour = new Squeak();
    }
}
