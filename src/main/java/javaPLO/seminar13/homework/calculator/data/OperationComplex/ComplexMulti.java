package javaPLO.seminar13.homework.calculator.data.OperationComplex;

import javaPLO.seminar13.homework.calculator.data.Complex;

public class ComplexMulti {

    public Complex multi(Complex a, Complex b) {
        double real = a.re() * b.re() - a.im() * b.im();
        double img = a.re() * b.im() + a.im() * b.re();
        return new Complex(real, img);
    }
}
