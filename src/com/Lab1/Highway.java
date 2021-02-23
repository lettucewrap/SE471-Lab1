package com.Lab1;

public class Highway extends Route {
    private String highwayName;

    Highway(String init_start, String init_end) {
        super(init_start, init_end);
    }

    public void printHighway() {
        System.out.println("HighwayName: " + this.highwayName);
    }

    public String getHighwayName() {
        return highwayName;
    }

    public void setHighwayName(String highwayName) {
        this.highwayName = highwayName;
    }
}

