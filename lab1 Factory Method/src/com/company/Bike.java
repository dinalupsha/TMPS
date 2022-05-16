package com.company;


public class Bike extends Delivers {
    public float speed;

    public Bike () {
        this.speed = (float) (Math.round(((float) (20 + Math.random() * 40)) * 100.0 ) / 100.0);
        setSpeed(this.speed);
    }
}
