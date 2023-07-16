package javaPLO.seminar13.homework.calculator.data.OperationComplex;

import javaPLO.seminar13.homework.calculator.data.Complex;

public class ComplexDiv {

    public Complex div(Complex a, Complex b) {
        double real = (a.re() * b.re() + a.im() + b.im()) / (a.re() * a.re() + a.im() + a.im());
        double img =  (b.im() * a.re() - b.re() * a.im()) / (a.re() * a.re() + a.im() + a.im());
        return new Complex(real, img);
    }
}
