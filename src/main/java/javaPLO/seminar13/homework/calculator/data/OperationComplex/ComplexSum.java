package javaPLO.seminar13.homework.calculator.data.OperationComplex;

import javaPLO.seminar13.homework.calculator.data.Complex;

public class ComplexSum {

    public Complex sum(Complex a, Complex b) {
        double real = a.re() + b.im();
        double img = a.im() + b.im();
        return new Complex(real, img);
    }
}
