package com.company;

// ConcreteFactory1

public class RestaurantFactory implements FoodFactory {
    @Override
    public Drink getDrink() {
        return new RestaurantDrink();
    }

    @Override
    public Salat getSalat() {
        return new RestaurantSalat();
    }

    @Override
    public Pizza getPizza() {
        return new RestaurantPizza();
    }
}
