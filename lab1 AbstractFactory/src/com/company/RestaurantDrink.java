package com.company;

// ConcreteProductC1

public class RestaurantDrink implements Drink {

    @Override
    public void getVodka() {
        System.out.println("Водка!");
    }

    @Override
    public void getWater() {
        System.out.println("Вода!");
    }

    @Override
    public void getJuice() {
        System.out.println("Сок");
    }
}
