package ru.omsu;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuadraticPolynomTest {
    private static final double DOUBLE_EPS = 1E-3;

    @Test
    public void testSolve() throws IncorrectValueException, HasNoRootsExceptoin {
        QuadraticPolynom first = new QuadraticPolynom(new double[]{0, 0, 1.0});//x^2
        QuadraticPolynom second = new QuadraticPolynom(new double[]{0, 3.0, 1.0});//x^2+3x
        QuadraticPolynom third = new QuadraticPolynom(new double[]{0, -5.0, 2.0});//2x^2-5x
        QuadraticPolynom fourth = new QuadraticPolynom(new double[]{-1.0, 0, 4.0});//4x^2-1

        assertArrayEquals(new double[]{0.0}, first.solve(), DOUBLE_EPS);
        assertArrayEquals(new double[]{0.0, -3.0}, second.solve(), DOUBLE_EPS);
        assertArrayEquals(new double[]{2.5, 0.0}, third.solve(), DOUBLE_EPS);
        assertArrayEquals(new double[]{0.5, -0.5}, fourth.solve(), DOUBLE_EPS);
    }

    @Test
    public void testEquals() throws Exception {
        QuadraticPolynom first = new QuadraticPolynom(new double[]{3, 2, 1});//x^2+2x+3
        QuadraticPolynom second = new QuadraticPolynom(new double[]{3, 2, 1});//x^2+2x+3
        QuadraticPolynom third = new QuadraticPolynom(new double[]{2, 2, 1});//x^2+2x+2
        QuadraticPolynom fourth = new QuadraticPolynom();

        assertTrue(first.equals(first));
        assertTrue(first.equals(second));
        assertFalse(first.equals(third));
        assertFalse(first.equals(fourth));
    }

    @Test
    public void testGetCoef() throws IncorrectValueException {
        QuadraticPolynom first = new QuadraticPolynom(new double[]{0, -3.0, 1.0});//x^2-3x
        assertEquals(1.0, first.getCoef(2), DOUBLE_EPS);
        assertEquals(-3.0, first.getCoef(1), DOUBLE_EPS);
        assertEquals(0, first.getCoef(0), DOUBLE_EPS);
    }

    @Test(expected = IncorrectValueException.class)
    public void testGetCoefException() throws Exception {
        QuadraticPolynom first = new QuadraticPolynom(new double[]{0, -3.0, 1.0});//x^2-3x
        first.getCoef(3);
    }

    @Test(expected = HasNoRootsExceptoin.class)
    public void testHashCode() throws HasNoRootsExceptoin, IncorrectValueException {
        QuadraticPolynom first = new QuadraticPolynom(new double[]{3, 2, 1});//x^2+2x+3
        QuadraticPolynom second = new QuadraticPolynom(new double[]{3, 2, 1});//x^2+2x+3
        QuadraticPolynom third = new QuadraticPolynom(new double[]{2, 2, 1});//x^2+2x+2
        first.solve();
        second.solve();
        third.solve();
    }

}
