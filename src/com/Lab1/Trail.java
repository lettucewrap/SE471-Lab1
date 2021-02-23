package com.Lab1;

public class Trail extends Route{
    private String trail;

    Trail(String init_start, String init_end) {
        super(init_start, init_end);
    }

    public void printTrail() {
        System.out.println("TrailName: " + this.trail);
    }

    public String getTrail() {
        return trail;
    }

    public void setTrail(String trail) {
        this.trail = trail;
    }
}


