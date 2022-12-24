package ru.omsu;

public class SumOfLeftMidRight<T extends IFunction> implements IFunctional<T> {
    @Override
    public double calculate(T function) {
        return function.getValue(function.getLeftBorder()) + function.getValue(function.getRightBorder()) +
                function.getValue((function.getRightBorder() - function.getLeftBorder()) / 2);
    }
}
