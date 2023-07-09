package JavaPLO.Seminar11.HomeWork.calculator.data.Calculator;

import JavaPLO.Seminar11.HomeWork.calculator.data.Complex;

public class CalculatorComplex extends Calculator<Complex> {
    private Complex numOne;
    private Complex numTwo;

    public CalculatorComplex(String in) {
        char[] chars = in.toCharArray();
        String temp = "";
        double re;
        double im;
        for (char ch : chars) {
            if (ch == '/' || ch == '*' || ch == '+' || ch == '-') {
                super.operation = ch;
                String[] complex = temp.strip().split(" ");
                re = Double.parseDouble(complex[0]);
                im = Double.parseDouble(complex[1]);
                this.numOne = new Complex(re, im);
                temp = "";
            } else temp += ch;
        }
        String[] complex = temp.strip().split(" ");
        re = Double.parseDouble(complex[0]);
        im = Double.parseDouble(complex[1]);
        this.numTwo = new Complex(re, im);
    }

    public CalculatorComplex(Complex num, String in) {
        this.numOne = num;
        char[] chars = in.toCharArray();
        String temp = "";
        double re;
        double im;
        for (char ch : chars) {
            if (ch == '/' || ch == '*' || ch == '+' || ch == '-') {
                super.operation = ch;
                temp = "";
            } else temp += ch;
        }
        String[] complex = temp.strip().split(" ");
        re = Double.parseDouble(complex[0]);
        im = Double.parseDouble(complex[1]);
        this.numTwo = new Complex(re, im);
    }

    public Complex getNumOne() {
        return numOne;
    }

    public Complex getNumTwo() {
        return numTwo;
    }

    @Override
    public String toString() {
        return numOne + " " + operation + " " + numTwo;
    }
}
