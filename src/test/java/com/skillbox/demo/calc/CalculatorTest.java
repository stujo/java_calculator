package com.skillbox.demo.calc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    static final double sEPSILON = 0.00001;

    Calculator mCalculator = new Calculator();

    @Before
    public void clearCalculatorMemory() {
        mCalculator.clear();
    }

    @Test
    public void testInitialValue() {
        Assert.assertEquals(0, mCalculator.getCurrentValue(), sEPSILON);
    }

    @Test
    public void testAdd5() {
        Assert.assertEquals(5, mCalculator.add(5), sEPSILON);
    }

    @Test
    public void testAdd55() {
        Assert.assertEquals(55, mCalculator.add(55), sEPSILON);
    }

    @Test
    public void testAddMinus32() {
        mCalculator.add(17);
        Assert.assertEquals(-15, mCalculator.add(-32), sEPSILON);
    }
}
