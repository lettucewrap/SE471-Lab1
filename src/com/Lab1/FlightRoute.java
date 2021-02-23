package com.Lab1;

public class FlightRoute extends Route{
    private String flightNO;

    FlightRoute(String init_start, String init_end) {
        super(init_start, init_end);
    }

    public void printFlight() {
        System.out.println("FlightNO: " + this.flightNO);
    }

    public String getFlightNO() {
        return flightNO;
    }

    public void setFlightNO(String flightNO) {
        this.flightNO = flightNO;
    }
}
