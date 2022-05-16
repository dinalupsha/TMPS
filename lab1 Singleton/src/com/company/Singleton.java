package com.company;

// Singleton

public class Singleton {

    private static Singleton instance;

    private Singleton() {
        System.out.println(
                "1. Pizza Rancho - 68 L\n" +
                "2. French Fries - 33 L\n" +
                "3. Shrimp Caesar - 85 L\n" +
                "4. Spinach Soup - 40 L\n"
        );
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
