package ru.omsu;

public class MaxRoot {
    private QuadraticPolynom quadraticPolynom;

    public MaxRoot() {

        quadraticPolynom = new QuadraticPolynom();
    }

    public MaxRoot(double[] arr) throws IncorrectValueException {
        quadraticPolynom = new QuadraticPolynom(arr);
    }

    public double maxRoot() throws HasNoRootsExceptoin {
        if (quadraticPolynom.solve().length == 0) {
            throw new HasNoRootsExceptoin("Equation has no roots.");
        }
        if (quadraticPolynom.solve().length == 1) {
            return quadraticPolynom.solve()[0];
        }
        if (quadraticPolynom.solve()[0] > quadraticPolynom.solve()[1]) {
            return quadraticPolynom.solve()[0];
        }
        return quadraticPolynom.solve()[1];
    }
}

