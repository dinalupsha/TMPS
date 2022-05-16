package com.company;

public class Create {
    private int length;

    public Delivers[] createDelivers (int length) {
        this.length = length;
        int toss;

        Delivers[] delivers = new Delivers[length];

        for( int i = 0; i < delivers.length; i++) {
            toss = (int)(Math.random() * 2);
            if ( toss == 0 ) {
                delivers[i] = new Car();
            } else {
                delivers[i] = new Bike();
            }
        }

        for( int i = 0; i < delivers.length; i++) {
            System.out.println("\nОбъект №"+(i+1));
            System.out.println(delivers[i].toString());

        }
        return delivers;
    }
}
