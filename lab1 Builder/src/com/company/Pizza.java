package com.company;

// Concrete Builder

public class Pizza {
    String name;
    Type type;
    Size size;
    int price;

    public void setName(String name) {
        this.name = name;
    }
    public void setType (Type type) {
        this.type = type;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setSize(Size size) {
        this.size = size;
    }

    public String toString() {
        return name + " - " + type + ", " + size + ", " + price + "L";
    }
}
