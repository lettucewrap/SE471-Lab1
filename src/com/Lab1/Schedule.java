package com.Lab1;

public class Schedule {
    private String start_time;
    private String end_time;
    private Route myRoute;
    private Vehicle myVehicle;
    private Trip myTrip;

    Schedule(String init_start, String init_end){
        this.start_time = init_start;
        this.end_time = init_end;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public void setMyRoute(Route myRoute) {
        this.myRoute = myRoute;
    }

    public Route getMyRoute() {
        return myRoute;
    }

    public void setMyTrip(Trip myTrip) {
        this.myTrip = myTrip;
    }

    public Trip getMyTrip() {
        return myTrip;
    }

    public void setMyVehicle(Vehicle myVehicle) {
        this.myVehicle = myVehicle;
    }

    public Vehicle getMyVehicle() {
        return myVehicle;
    }
}
