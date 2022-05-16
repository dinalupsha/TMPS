package com.company;

// Product A

public class Margherita extends PizzaBuilder{

    @Override
    void buildName() {
        pizza.setName("Margherita");
    }

    @Override
    void buildType() {
        pizza.setType(Type.REGULAR);
    }

    @Override
    void buildSize() {
        pizza.setSize(Size.MEDIUM);
    }

    @Override
    void buildPrice() {
        pizza.setPrice(70);
    }
}
