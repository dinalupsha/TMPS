package com.company;

// Client

public class Main {

    public static void main(String[] args) {

        Director director = new Director();
        director.setBuilder(new Mexican());
        Pizza pizza1 = director.buildPizza();
        System.out.println(pizza1);

        director.setBuilder(new Veggie());
        Pizza pizza2 = director.buildPizza();
        System.out.println(pizza2);

        director.setBuilder(new Margherita());
        Pizza pizza3 = director.buildPizza();
        System.out.println(pizza3);

    }
}
