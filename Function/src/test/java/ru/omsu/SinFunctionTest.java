package ru.omsu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SinFunctionTest {
    @Test
    public void SinFunctionTest0() {
        SinFunction sinFunction = new SinFunction(1, 10, 0, Math.PI);
        assertEquals(0.0, sinFunction.getValue(2), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void SinFunctionTest1() {
        SinFunction sinFunction = new SinFunction(1, 1, -100, 100);
        assertEquals(0.0, sinFunction.getValue(200), 0.001);
    }
}
