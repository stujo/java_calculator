package com.skillbox.demo.calc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class CalculatorTest {

    static final double sEPSILON = 0.0000000001;

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

    @Test
    public void testSomeDecimals() {
        mCalculator.add(5.123123);
        Assert.assertEquals(10.2462463, mCalculator.add(5.1231233), sEPSILON);
    }

    @Test
    public void testSomeMoreDecimals() {
        mCalculator.add(2.2222222222);
        Assert.assertEquals(3.3333333333, mCalculator.add(1.1111111111), sEPSILON);
    }


    @Test
    public void testSomeBigDecimals() {
        mCalculator.add(new BigDecimal("2.2222222222"));
        Assert.assertEquals(3.3333333333, mCalculator.add(new BigDecimal("1.1111111111")), sEPSILON);
    }
}
