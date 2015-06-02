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

    protected static double callories(Person person, int count, Bicycle bicycle) {
        return (double) ((((person.old + person.height + person.girth) / person.weight) * vel(bicycle) * count));
    }

    protected static float vel(Bicycle bicycle) {
        float vel = 0;
        if (bicycle instanceof SprintBicycle) {
            SprintBicycle sprintBicycle = (SprintBicycle) bicycle;
            vel = sprintBicycle.wheelsDiameter * sprintBicycle.baseSize / sprintBicycle.wheelsDiameter;
        }
        return vel;
    }
}
