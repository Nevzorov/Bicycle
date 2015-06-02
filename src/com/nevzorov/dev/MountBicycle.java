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


    protected static double callories(Person person, int count, Bicycle bicycle) {
        return (double) ((((person.old + person.height + person.girth) / person.weight) * vel(bicycle) * count));
    }

    protected static float vel(Bicycle bicycle) {
        float vel = 0;
        if (bicycle instanceof MountBicycle) {
            MountBicycle mountBicycle = (MountBicycle) bicycle;
            vel = mountBicycle.wheelsDiameter * mountBicycle.baseSize / mountBicycle.countGears;
        }
        return vel;
    }
}
