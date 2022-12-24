package ru.omsu;

public class Integral<T extends IFunction> implements IFunctional<T> {

    private double left;
    private double right;
    private int splitsCount;

    public Integral(double left, double right, int splitsCount) throws IllegalArgumentException {
        if (left > right) {
            throw new IllegalArgumentException("Left value more than right value");
        }
        this.left = left;
        this.right = right;
        this.splitsCount = splitsCount;
    }

    @Override
    public double calculate(T function) {
        if (function == null) {
            throw new IllegalArgumentException("Function is null");
        }

        final double h = (right - left) / splitsCount;
        double integral = 0;
        for (int i = 1; i <= splitsCount; i++) {
            integral += function.getValue(left + h * i);
        }

        return integral * h;
    }
}
