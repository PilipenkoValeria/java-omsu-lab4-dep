package ru.omsu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinearFunctionTest {
    @Test
    public void LinearFunctionTest0() {
        LinearFunction linearFunction = new LinearFunction(1, 100, 1, 10);
        assertEquals(20, linearFunction.getValue(10), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void LinearFunctionTest1() {
        LinearFunction linearFunction = new LinearFunction(1, 1, -100, 100);
        assertEquals(2.0, linearFunction.getValue(112), 0.001);
    }
}
