package javaPLO.seminar13.homework.calculator.data.OperationComplex;

import javaPLO.seminar13.homework.calculator.data.Complex;

public class ComplexDiff {

    public Complex diff(Complex a, Complex b) {
        double real = a.re() - b.re();
        double img = a.im() - b.im();
        return new Complex(real, img);
    }
}
