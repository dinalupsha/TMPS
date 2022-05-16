package com.company;

// Interface Builder

abstract class PizzaBuilder{
    Pizza pizza;
    void cookPizza() {
        pizza = new Pizza();
    }

    abstract void buildName();
    abstract void buildType();
    abstract void buildSize();
    abstract void buildPrice();

    Pizza getPizza () {
        return pizza;
    }

}
