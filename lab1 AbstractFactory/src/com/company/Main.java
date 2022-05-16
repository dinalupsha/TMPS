package com.company;

public class Main {

    // Client

    public static void main(String[] args) {

        FoodFactory factory = getFactoryChoice(1);


        Pizza pizzaRest = factory.getPizza();
        Salat salatRest = factory.getSalat();
        Drink drinkRest = factory.getDrink();


        pizzaRest.getDiablo(); // Product
        salatRest.getCeasar();
        drinkRest.getJuice();

        FoodFactory factory2 = getFactoryChoice(2);


        Pizza pizzaDiner = factory2.getPizza();
        Salat salatDiner = factory2.getSalat();
        Drink drinkDiner = factory2.getDrink();


        pizzaDiner.getMargherita(); // Product
        salatDiner.getGreek();
        drinkDiner.getVodka();


    }

    private static FoodFactory getFactoryChoice(int choice) {
        switch (choice) {
            case 1:
                return new RestaurantFactory();
            case 2:
                return new DinerFactory();
            default:
                throw new RuntimeException(
                        "Ошибка: Можно выбрать только Ресторан(1) или Забегаловка(2)..."
                );
        }
    }
}

