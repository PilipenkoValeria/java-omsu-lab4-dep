package ru.omsu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfLeftMidRightTest {
    @Test
    public void LinearFunctionSumOfLeftMidRightTest() {
        LinearFunction linearFunction = new LinearFunction(-1000, 1000, 2, 4);
        SumOfLeftMidRight<LinearFunction> linearFunctionSumOfLeftMidRight = new SumOfLeftMidRight<>();
        assertEquals(2012, linearFunctionSumOfLeftMidRight.calculate(linearFunction), 0.001);
    }

    @Test
    public void SinFunctionSumOfLeftMidRightTest() {
        SinFunction sinFunction = new SinFunction(-1000, 1000, 1, 0);
        SumOfLeftMidRight<SinFunction> sinFunctionSumOfLeftMidRight = new SumOfLeftMidRight<>();
        assertEquals(0, sinFunctionSumOfLeftMidRight.calculate(sinFunction), 0.001);
    }

    @Test
    public void RationalFunctionSumOfLeftMidRightTest() {
        RationalFunction rationalFunction = new RationalFunction(-1000, 1000, 1, 6, 1, 6);
        SumOfLeftMidRight<RationalFunction> rationalFunctionSumOfLeftMidRight = new SumOfLeftMidRight<>();
        assertEquals(3, rationalFunctionSumOfLeftMidRight.calculate(rationalFunction), 0.001);
    }

    @Test
    public void ExpFunctionSumOfLeftMidRightTest() {
        ExpFunction f = new ExpFunction(-1, 2, 1, 1);
        SumOfLeftMidRight<ExpFunction> expFunctionSumOfLeftMidRight = new SumOfLeftMidRight<>();
        assertEquals(15.238, expFunctionSumOfLeftMidRight.calculate(f), 0.001);
    }
}