package ru.omsu;

import java.util.Arrays;

public class QuadraticPolynom {
    private double[] coef;

    public QuadraticPolynom() {
        coef = new double[3];
        coef[0] = 0;// c
        coef[1] = 0;// b
        coef[2] = 1;// a
    }

    public QuadraticPolynom(double[] coef) throws IncorrectValueException {
        if (coef.length > 3) {
            throw new IncorrectValueException("Incorrect length of array.");
        }
        if (coef[2] == 0) {
            throw new IncorrectValueException("The leading coefficient must not be 0.");
        }
        this.coef = new double[coef.length];
        for (int i = 0; i < coef.length; i++) {
            this.coef[i] = coef[i];
        }
    }

    public double getCoef(int index) throws IncorrectValueException {
        if (index < 0 || index > 2) {
            throw new IncorrectValueException("Incorrect index of array.");
        }
        return coef[index];
    }

    public double[] solve() throws HasNoRootsExceptoin {
        double discriminant = coef[1] * coef[1] - 4 * coef[2] * coef[0];
        double[] solve = null;
        if (discriminant < 0) {
            throw new HasNoRootsExceptoin("Equation has no real roots (discriminant < 0).");
        }
        if (discriminant > 0) {
            solve = new double[2];
            solve[0] = (-coef[1] + Math.sqrt(discriminant)) / (2 * coef[2]);
            solve[1] = (-coef[1] - Math.sqrt(discriminant)) / (2 * coef[2]);
        }
        if (discriminant == 0) {
            solve = new double[1];
            solve[0] = (-coef[1] + Math.sqrt(discriminant)) / (2 * coef[2]);
        }
        return solve;
    }

    @Override
    public String toString() {
        return "Quadratic{" +
                "coef=" + Arrays.toString(coef) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof QuadraticPolynom)) return false;

        QuadraticPolynom quadraticPolynom = (QuadraticPolynom) o;

        return Arrays.equals(coef, quadraticPolynom.coef);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(coef);
    }
}

