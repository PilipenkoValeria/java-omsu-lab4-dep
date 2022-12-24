package ru.omsu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExpFunctionTest {
    @Test
    public void ExpFunctionTest0() {
        ExpFunction expFunction = new ExpFunction(0, 12, 1, 10);
        assertEquals(Math.exp(1) + 10.0, expFunction.getValue(1), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ExpFunctionTest1() {
        ExpFunction expFunction = new ExpFunction(1, 0, -100, 100);
        assertEquals(2.0, expFunction.getValue(200), 0.001);
    }
}
