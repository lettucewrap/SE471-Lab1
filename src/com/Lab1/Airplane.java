package com.Lab1;

public class Airplane extends Vehicle {
    private String type;

    public Airplane(String init_make, String init_model, int init_year, String init_type) {
        super(init_make, init_model, init_year);

        this.type = init_type;
    }

    public void printAirplane() {
        System.out.println("Type: " + this.type);
    }

    public String getType(){
        return type;
    }
}
