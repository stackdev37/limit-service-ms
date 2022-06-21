package com.stackdev37.limitservice1;

public class LImitConfiguration {
    private int maximum;
    private int minimum;

    protected LImitConfiguration() {

    }

    public LImitConfiguration(int maximum, int minimum) {
        super();
        this.maximum = maximum;
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public int getMinimum() {
        return minimum;
    }
}
