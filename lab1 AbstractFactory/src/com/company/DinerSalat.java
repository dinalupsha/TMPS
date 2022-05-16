package com.company;

// ConcreteProductB2

public class DinerSalat implements Salat {
    @Override
    public void getCeasar() {
        System.out.println("Ваш Цезарь!");
    }

    @Override
    public void getGreek() {
        System.out.println("Ваш Греческий салат!");
    }

    @Override
    public void getWarm() {
        System.out.println("Ваш Теплый салат!");
    }
}
