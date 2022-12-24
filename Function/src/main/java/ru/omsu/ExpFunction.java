package ru.omsu;

public class ExpFunction implements IFunction {

    private double leftBorder;
    private double rightBorder;

    private double a;
    private double b;

    @Override
    public double getLeftBorder() {
        return leftBorder;
    }

    @Override
    public double getRightBorder() {
        return rightBorder;
    }

    public ExpFunction(double leftBorder, double rightBorder, double a, double b) {
        if (leftBorder > rightBorder) {
            throw new IllegalArgumentException("Left border more than right border");
        }
        this.leftBorder = leftBorder;
        this.rightBorder = rightBorder;
        this.a = a;
        this.b = b;
    }

    @Override
    public double getValue(double x) {
        if (x < leftBorder || x > rightBorder) {
            throw new IllegalArgumentException("x out of definition");
        }
        return (a * Math.pow(Math.E, x) + b);
    }
}
