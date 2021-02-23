package com.Lab1;

import java.util.List;

public class Vehicle {
    private String maker;
    private String model;
    private int year;
    private List<Schedule> vehicleSchedule;

    public Vehicle(String init_make, String init_model, int init_year){

        this.maker = init_make;
        this.model = init_model;
        this.year = init_year;

    }

    public void printVehicle() {
        System.out.println("Make: " + this.maker +  " Model: " +  this.model +
                " Year: " + this.year);
    }

    public String getMaker(){
        return maker;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public List<Schedule> getVehicleSchedule() {
        return vehicleSchedule;
    }

    public void setVehicleSchedule(List<Schedule> vehicleSchedule) {
        this.vehicleSchedule = vehicleSchedule;
    }
}
