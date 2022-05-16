package com.company;

import java.nio.channels.Pipe;

public class Director {
    PizzaBuilder builder;
    void setBuilder(PizzaBuilder b) {
        builder = b;
    }

    Pizza buildPizza() {
        builder.cookPizza();
        builder.buildName();
        builder.buildType();
        builder.buildSize();
        builder.buildPrice();
        Pizza pizza = builder.getPizza();
        return pizza;
    }
}
