package com.company;

// Product B

public class Mexican extends PizzaBuilder {
    @Override
    void buildName() {
        pizza.setName("Diablo");
    }

    @Override
    void buildType() {
        pizza.setType(Type.SPICY);
    }

    @Override
    void buildSize() {
        pizza.setSize(Size.LARGE);
    }

    @Override
    void buildPrice() {
        pizza.setPrice(100);
    }
}
