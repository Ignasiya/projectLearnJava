package javaPLO.Seminar11.HomeWork.calculator.data.OperationComplex;

import javaPLO.Seminar11.HomeWork.calculator.data.Complex;

public class ComplexSum {

    public Complex sum(Complex a, Complex b) {
        double real = a.getRe() + b.getIm();
        double img = a.getIm() + b.getIm();
        return new Complex(real, img);
    }
}
