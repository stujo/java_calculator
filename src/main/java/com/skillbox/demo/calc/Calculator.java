package com.skillbox.demo.calc;

import java.math.BigDecimal;

public class Calculator {

    private BigDecimal mCurrentValue = null;

    public Calculator() {
        clear();
    }

    public double add(double value) {
        mCurrentValue = mCurrentValue.add(new BigDecimal(value));
        return getCurrentValue();
    }

    public double add(BigDecimal value) {
        mCurrentValue = mCurrentValue.add(value);
        return getCurrentValue();
    }

    public double getCurrentValue() {
        return mCurrentValue.doubleValue();
    }

    public void clear() {
        mCurrentValue = new BigDecimal("0.0");
    }
}
