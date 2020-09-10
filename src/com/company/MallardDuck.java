package com.company;

public class MallardDuck extends BaseDuck {
    public MallardDuck() {
        this.flyBehaviour = new FlyWithWings();
        this.quackBehaviour = new Quack();
    }
}
