package ru.omsu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RationalFunctionTest {

    @Test
    public void RationalFunctionTest0() {
        RationalFunction rationalFunction = new RationalFunction(1, 100, 1, 10, 1, 10);
        assertEquals(1, rationalFunction.getValue(10), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void RationalFunctionTest2() {
        RationalFunction rationalFunction = new RationalFunction(1, 1, 1, 1, -100, 100);
        rationalFunction.getValue(200);
        assertEquals(20, rationalFunction.getValue(10), 0.001);
    }
}
