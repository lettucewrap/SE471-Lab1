package com.Lab1;

public class ExpressBus extends Bus {

    private String exBusNO;

    public ExpressBus(String init_make, String init_model, int init_year, String vin) {
        super(init_make, init_model, init_year, vin);
    }

    public void printExBus() {
        System.out.println("ExBusNO: " + this.exBusNO);
    }

    public String getExBusNO() {
        return exBusNO;
    }

    public void setExBusNO(String exBusNO) {
        this.exBusNO = exBusNO;
    }
}
