package com.company;

// Product C

public class Veggie extends PizzaBuilder{
    @Override
    void buildName() {
        pizza.setName("Veggie");
    }

    @Override
    void buildType() {
        pizza.setType(Type.VEGAN);
    }

    @Override
    void buildSize() {
        pizza.setSize(Size.SMALL);
    }

    @Override
    void buildPrice() {
        pizza.setPrice(60);
    }
}
