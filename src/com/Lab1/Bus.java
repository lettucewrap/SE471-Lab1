package com.Lab1;

public class Bus extends Vehicle {

    private String vin;
    private String plateNo;

    public Bus(String init_make, String init_model, int init_year, String init_vin) {
        super(init_make, init_model, init_year);

        this.vin = init_vin;
    }

    public void printBus() {
        System.out.println("VIN: " + this.vin +  " PlateNO: " +  this.plateNo);
    }

    public String getVIN() {
        return vin;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }
}
