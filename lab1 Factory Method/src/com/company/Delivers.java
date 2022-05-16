package com.company;


 public class Delivers {
    public String name;
    public int id;
    public float speed;
    public int deliveryCount;
    private String[] names = {
            "Alexei",
            "Olga",
            "Vadim",
            "Dina",
            "Tolik",
            "Sveta",
            "Vitya",
            "Dima",
            "Kolya"
    };

    public Delivers() {
        this.name = names[(int)(Math.random() * names.length)];
        this.id = (int)(1 + Math.random() * 1000);
        this.deliveryCount = (int)(1 + Math.random() * 30);
    }

    public String toString() {
        return "Name: " + this.name + ", Id: " + this.id + ", Delivered: " + this.deliveryCount + ", Speed: " + speed;
    }

    public void setSpeed (float speed) {
        this.speed = speed;
    }
}
