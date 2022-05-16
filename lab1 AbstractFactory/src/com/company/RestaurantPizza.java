package com.company;

// ConcreteProductB1

public class RestaurantPizza implements Pizza {
    @Override
    public void getRancho() {
        System.out.println("Ранчо подано!");
    }

    @Override
    public void getDiablo() {
        System.out.println("Диабло подано!");
    }

    @Override
    public void getMargherita() {
        System.out.println("Маргарита подано!");
    }
}
