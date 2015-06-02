package com.nevzorov.dev;

public class GnomeBicycle extends Bicycle {
    protected int thirdWheelWidth;
    public GnomeBicycle(int wheelsDiameter, float baseSize, boolean isBrakeExist, int thirdWheelWidth) {
        super(wheelsDiameter, baseSize, isBrakeExist);
        this.thirdWheelWidth = thirdWheelWidth;
    }

    public float probegLength (int count) {
        float probeg = wheelLength() * count;
        return probeg;
    }
}
