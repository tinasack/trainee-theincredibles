package com.accenture.incredibles.instrument.models;

public class Instrument {
    public String name;
    public String art;

    public Instrument(String name, String art) {
        this.name = name;
        this.art = art;
    }
    // method for printing information
    public void printInfo() {
        System.out.println(name + ", " + art);
    }
}
