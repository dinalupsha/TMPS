package com.company;



public class Car extends Delivers {
        public float speed;

        public Car () {
            this.speed = (float) (Math.round(((float) (50 + Math.random() * 70)) * 100.0 ) / 100.0);
            setSpeed(this.speed);
        }
}


