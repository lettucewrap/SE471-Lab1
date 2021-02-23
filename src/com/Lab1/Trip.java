package com.Lab1;

import java.util.List;

public class Trip {
    private String from;
    private String destination;
    private List<Schedule> tripSchedule;

    Trip(String init_from, String init_destination){
        this.from = init_from;
        this.destination = init_destination;
    }

    public void printTrip() {
        System.out.println("Starting: " + this.from +  " Ending: " +  this.destination);
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public List<Schedule> getTripSchedule() {
        return tripSchedule;
    }

    public void setTripSchedule(List<Schedule> tripSchedule) {
        this.tripSchedule = tripSchedule;
    }
}
