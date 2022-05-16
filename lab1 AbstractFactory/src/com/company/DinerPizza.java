package com.company;

// ConcreteProductA2

public class DinerPizza implements Pizza {

    @Override
    public void getRancho() {
        System.out.println("Ваше Ранчо!");
    }

    @Override
    public void getDiablo() {
        System.out.println("Ваша Диабала!");
    }

    @Override
    public void getMargherita() {
        System.out.println("Ваша Маргарита!");
    }
}
