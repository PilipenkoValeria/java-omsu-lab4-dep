package ru.omsu;

public class RationalFunction implements IFunction {

    private double leftBorder;
    private double rightBorder;

    private double a;
    private double b;
    private double c;
    private double d;


    public RationalFunction(double leftBorder, double rightBorder, double a, double b, double c, double d) {
        if (leftBorder > rightBorder) {
            throw new IllegalArgumentException("Left border more than right border");
        }
        if (c == 0 && d == 0) {
            throw new IllegalArgumentException();
        }
        this.leftBorder = leftBorder;
        this.rightBorder = rightBorder;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double getLeftBorder() {
        return leftBorder;
    }

    @Override
    public double getRightBorder() {
        return rightBorder;
    }


    @Override
    public double getValue(double x) {
        if (x < leftBorder || x > rightBorder) {
            throw new IllegalArgumentException("x out of definition");
        }
        if ((c * x + d) == 0) {
            throw new IllegalArgumentException("denominator equals 0");
        }
        return (a * x + b) / (c * x + d);
    }
}
