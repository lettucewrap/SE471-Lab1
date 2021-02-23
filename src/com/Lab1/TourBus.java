package com.Lab1;

public class TourBus extends Bus {

    private String trBusID;

    public TourBus(String init_make, String init_model, int init_year, String vin) {
        super(init_make, init_model, init_year, vin);
    }

    public void printTrBus() {
        System.out.println("TrBusName: " + this.trBusID);
    }

    public String getTrBusID() { return trBusID; }

    public void setTrBusID(String trBusName) {
        this.trBusID = trBusName;
    }
}
