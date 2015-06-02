package com.nevzorov.dev;

public class SprintBicycle extends AdultBicycle{
    public float wheealsThin;
    public SprintBicycle(int wheelsDiameter, float baseSize, boolean isBrakeExist, Person person, int weealsThin) {
        super(wheelsDiameter, baseSize, isBrakeExist, person);
        this.wheealsThin = weealsThin;
    }
    public SprintBicycle(int wheelsDiameter, float baseSize, boolean isBrakeExist, float weealsThin) {
        super(wheelsDiameter, baseSize, isBrakeExist);
        this.wheealsThin = weealsThin;
    }
    @Override
    protected double callories(Person person, int count, Bicycle bicycle) {
        double cal = (double) ((((person.old + person.height + person.girth) / person.weight) * vel() * count));
        return cal;
    }

    @Override
    protected float vel() {
        super.vel();
        return this.baseSize*this.wheelsDiameter/this.wheelLength();
    }
}
