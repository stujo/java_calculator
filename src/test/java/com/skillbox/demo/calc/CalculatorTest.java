package com.skillbox.demo.calc;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest extends TestCase {

    static final double sEPSILON = 0.00001;

    Calculator mCalculator = null;

    protected void setUp() throws Exception {
        super.setUp();
        mCalculator = new Calculator();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
        mCalculator = null;
    }

    @Before
    public void clearCalculatorMemory() {
        mCalculator.clear();
    }

    @Test
    public void testInitialValue() {
        assertEquals(0, mCalculator.getCurrentValue(), sEPSILON);
    }

    @Test
    public void testAdd5() {
        assertEquals(5, mCalculator.add(5), sEPSILON);
    }

    @Test
    public void testAdd55() {
        assertEquals(55, mCalculator.add(55), sEPSILON);
    }
}
