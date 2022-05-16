package com.company;

// ConcreteProductC2

public class DinerDrink implements Drink {
    @Override
    public void getVodka() {
        System.out.println("Водки");
    }

    @Override
    public void getWater() {
        System.out.println("Воду!");
    }

    @Override
    public void getJuice() {
        System.out.println("Сока!");
    }
}
