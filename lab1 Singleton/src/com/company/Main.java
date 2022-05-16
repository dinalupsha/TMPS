package com.company;

// Client

public class Main {


    public static void main(String[] args) {

        Singleton orderList = Singleton.getInstance();
        // Lazy Singleton - тот, который создается только при обращении к .getInstance()✅


        System.out.println(orderList.hashCode() + "\n");

        Singleton orderList2 = Singleton.getInstance();
        System.out.println(orderList2.hashCode() + "\n");
    }
}
