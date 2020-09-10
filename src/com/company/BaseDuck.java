package com.company;

public abstract class BaseDuck {
    IFlyBehaviour flyBehaviour;
    IQuackBehaviour quackBehaviour;

    public void swim() {
        System.out.println("Swimminggg~~~~");
    }

    public void setFlyBehaviour(IFlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(IQuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void performFly() {
        this.flyBehaviour.fly();
    }

    public void performQuack() {
        this.quackBehaviour.quack();
    }
}
