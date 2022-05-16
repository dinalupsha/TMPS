package com.company;

// ConcreteFactory2

public class DinerFactory implements FoodFactory {

    @Override
    public Drink getDrink() {
        return new DinerDrink();
    }

    @Override
    public Pizza getPizza() {
        return new DinerPizza();
    }

    @Override
    public Salat getSalat() {
        return new DinerSalat();
    }
}
