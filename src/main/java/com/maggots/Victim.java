package com.maggots;

public class Victim extends Maggot implements Person {
    boolean deserted;

    public Victim (boolean isDeserted, String name){
        super(name);
        this.deserted = isDeserted;
    }
}
