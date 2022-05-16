package com.company;

// ConcreteProductA1

public class RestaurantSalat implements Salat {

    @Override
    public void getCeasar() {
        System.out.println("Цезарь подан!");
    }

    @Override
    public void getGreek() {
        System.out.println("Греческий салат подан!");
    }

    @Override
    public void getWarm() {
        System.out.println("Теплый салат подан!");
    }
}
