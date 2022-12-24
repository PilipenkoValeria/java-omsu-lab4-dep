package ru.omsu;

public interface IFunctional<T extends IFunction> {
    double calculate(T function);
}
