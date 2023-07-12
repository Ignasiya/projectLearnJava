package javaPLO.Seminar11.HomeWork.calculator.data.OperationComplex;

import javaPLO.Seminar11.HomeWork.calculator.data.Complex;

public class ComplexDiff {

    public Complex diff(Complex a, Complex b) {
        double real = a.getRe() - b.getRe();
        double img = a.getIm() - b.getIm();
        return new Complex(real, img);
    }
}
