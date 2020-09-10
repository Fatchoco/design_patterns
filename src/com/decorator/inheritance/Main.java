package com.decorator.inheritance;

public class Main {
    public static void main(String[] args) {
        Beverage b1 = new HouseBlend();
        System.out.println(b1.getDescription() + "(" + b1.getSize() + ")" + " $" + b1.cost());

        b1 = new Whip(new Milk(b1));
        System.out.println(b1.getDescription() + "(" + b1.getSize() + ")" + " $" + b1.cost());

        System.out.println("================");

        Beverage b2 = new HouseBlend();
        b2.setSize(Beverage.Size.VENTI);
        System.out.println(b2.getDescription() + "(" + b2.getSize() + ")" + " $" + b2.cost());

        b2 = new Milk(new Whip(new Milk(b2)));
        System.out.println(b2.getDescription() + "(" + b2.getSize() + ")" + " $" + b2.cost());

        System.out.println("================");

        Beverage b3 = new HouseBlend();
        b3.setSize(Beverage.Size.GRANDE);
        System.out.println(b3.getDescription() + "(" + b3.getSize() + ")" + " $" + b3.cost());

        b3 = new Milk(new Whip(new Milk(b3)));
        System.out.println(b3.getDescription() + "(" + b3.getSize() + ")" + " $" + b3.cost());
    }
}
