package com.company;

public class Main {

    public static void main(String[] args) {
        MallardDuck duck1 = new MallardDuck();
        RubberDuck duck2 = new RubberDuck();

        System.out.println("--------------------");
        duck1.performFly();
        duck1.performQuack();
        System.out.println("--------------------");
        duck2.performFly();
        duck2.performQuack();
        duck2.setQuackBehaviour(new MuteQuack());
        duck2.performFly();
        duck2.performQuack();
        System.out.println("--------------------");
    }
}
