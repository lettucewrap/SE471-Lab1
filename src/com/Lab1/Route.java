package com.Lab1;

import java.util.List;

public class Route {
    private String start_point;
    private String end_point;
    private List<Schedule> routeSchedule;

    Route(String init_start, String init_end){
        this.start_point = init_start;
        this.end_point = init_end;
    }

    public void printRoute() {
        System.out.println("Starting: " + this.start_point +  " Ending: " +  this.end_point);


    }

    public String getStart_point() {
        return start_point;
    }

    public void setStart_point(String start_point) {
        this.start_point = start_point;
    }

    public String getEnd_point() {
        return end_point;
    }

    public void setEnd_point(String end_point) {
        this.end_point = end_point;
    }

    public List<Schedule> getRouteSchedule() {
        return routeSchedule;
    }

    public void setRouteSchedule(List<Schedule> routeSchedule) {
        this.routeSchedule = routeSchedule;
    }
}
