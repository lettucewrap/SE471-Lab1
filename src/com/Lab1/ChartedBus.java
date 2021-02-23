package com.Lab1;

public class ChartedBus extends Bus{
    private String chBusName;

    public ChartedBus(String init_make, String init_model, int init_year, String vin) {
        super(init_make, init_model, init_year, vin);
    }

    public void printChBus() {
        System.out.println("ChBusName: " + this.chBusName);
    }

    public String getChBusName() {
        return chBusName;
    }

    public void setChBusName(String chBusName) {
        this.chBusName = chBusName;
    }
}
