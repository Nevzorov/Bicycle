package com.nevzorov.dev;

public class MountBicycle extends AdultBicycle{
    public int countGears;
    public MountBicycle(int wheelsDiameter, float baseSize, boolean isBrakeExist, int countGears, Person person) {
        super(wheelsDiameter, baseSize, isBrakeExist, person);
        this.countGears = countGears;
    }
    public MountBicycle(int wheelsDiameter, float baseSize, boolean isBrakeExist, int countGears) {
        super(wheelsDiameter, baseSize, isBrakeExist);
        this.countGears = countGears;
    }

    @Override
    protected double callories(Person person, int count, Bicycle bicycle) {
        double cal = (double) ((((person.old + person.height + person.girth) / person.weight) * vel() * count));
        return cal;
    }

    @Override
    protected float vel() {
        super.vel();
        return this.baseSize*this.wheelsDiameter/this.countGears;
    }
}
