package com.skillbox.demo.calc;

public class Calculator {

    private double mCurrentValue = 0.0;

    public double add(double value) {
        setCurrentValue(getCurrentValue() + value);
        return getCurrentValue();
    }

    public double getCurrentValue() {
        return mCurrentValue;
    }

    public void clear() {
        mCurrentValue = 0.0;
    }

    private void setCurrentValue(double value) {
        mCurrentValue = value;
    }
}
