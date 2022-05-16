package com.company;

// Client

public class Main {
    public static void main(String[] args) {
        Order original = new Order("20-04-2020", 342.43, 231, false);
        System.out.println(original);

        Order copy = (Order)original.clone();
        System.out.println(copy);
    }

}
