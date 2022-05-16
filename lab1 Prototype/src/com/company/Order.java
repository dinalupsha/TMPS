package com.company;

// Concrete Prototype

public class Order implements Copyable {
    String date;
    double price;
    int orderNumber;
    boolean discount;

    public Order(String date, double price, int orderNumber, boolean discount) {
        this.date = date;
        this.price = price;
        this.orderNumber = orderNumber;
        this.discount = discount;
    }

    public String toString() {
        return "-------Receipt-------\n" +
                "Date: " + date + "\n" +
                "Price: " + price + "\n" +
                "Order Number: " + orderNumber + "\n" +
                "Discount(20%): " + discount + "\n" +
                "Unique Number(hashCode): " + hashCode() + "\n" +
                "---------------------\n";
    }
    @Override
    public Object clone() {
            Order clone = new Order(date, price, orderNumber, discount);
            return clone;
    }
}
