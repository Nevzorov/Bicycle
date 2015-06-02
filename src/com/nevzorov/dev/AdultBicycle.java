package com.nevzorov.dev;

public abstract class AdultBicycle extends Bicycle {
    Person person;
    public AdultBicycle(int wheelsDiameter, float baseSize, boolean isBrakeExist, Person person) {
        super(wheelsDiameter, baseSize, isBrakeExist);
        this.person = person;
    }
    public AdultBicycle (int wheelsDiameter, float baseSize, boolean isBrakeExist){
        super(wheelsDiameter, baseSize, isBrakeExist);
    }
    protected abstract double callories (Person person, int count, Bicycle bicycle);

    protected float vel() {
        return 0;
    }
}
