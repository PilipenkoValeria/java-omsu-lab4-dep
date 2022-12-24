package ru.omsu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegralTest {
    @Test
    public void IntegralLinearFunctionTest() {
        LinearFunction linearFunction = new LinearFunction(-5, 5, 1, 0);
        Integral<LinearFunction> linearFunctionIntegral = new Integral<>(0, 1, 1000);
        assertEquals(0.5, linearFunctionIntegral.calculate(linearFunction), 0.001);
    }

    @Test
    public void IntegralSinFunctionTest() {
        SinFunction sinFunction = new SinFunction(-5, 5, 1, 1);
        Integral<SinFunction> sinFunctionIntegral = new Integral<>(0, Math.PI, 1000000);
        assertEquals(2, sinFunctionIntegral.calculate(sinFunction), 0.001);
    }

    @Test
    public void IntegralRationalFunctionTest() {
        RationalFunction rationalFunction = new RationalFunction(-5, 5, 2, 6, 1, 0);
        Integral<RationalFunction> rationalFunctionIntegral = new Integral<>(1, Math.E, 1000000);
        assertEquals(2 * Math.E + 4, rationalFunctionIntegral.calculate(rationalFunction), 0.001);
    }

    @Test
    public void IntegralExpFunctionTest() {
        ExpFunction expFunction = new ExpFunction(-5, 5, 1, 0);
        Integral<ExpFunction> expFunctionIntegral = new Integral<>(0, 2, 1000000);
        assertEquals(Math.exp(2) - Math.exp(0), expFunctionIntegral.calculate(expFunction), 0.001);
    }

}