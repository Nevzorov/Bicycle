package com.nevzorov.dev;

public class Bicycle {
    public int wheelsDiameter;
    public float baseSize;
    protected boolean isBrakeExist;
    boolean isBrakeExist1;
    private String name;


    public Bicycle(int wheelsDiameter, float baseSize, boolean isBrakeExist) {
        this.wheelsDiameter = wheelsDiameter;
        this.baseSize = baseSize;
        this.isBrakeExist = isBrakeExist;
        this.isBrakeExist1 = isBrakeExist1;
    }

    public Bicycle() {
    }

    public String getName(){return name;}

    public void setName(String name){
        this.name = name;
    }

    public float wheelLength(){
        float length = (float) (Math.PI * wheelsDiameter);
        return length;
    }
}
