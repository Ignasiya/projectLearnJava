package javaPLO.seminar13.homework.calculator.model;

import javaPLO.seminar13.homework.calculator.data.Calculator.Calculator;
import javaPLO.seminar13.homework.calculator.data.Complex;
import javaPLO.seminar13.homework.calculator.data.OperationComplex.ComplexDiff;
import javaPLO.seminar13.homework.calculator.data.OperationComplex.ComplexDiv;
import javaPLO.seminar13.homework.calculator.data.OperationComplex.ComplexMulti;
import javaPLO.seminar13.homework.calculator.data.OperationComplex.ComplexSum;

public class ModelComplex implements Model {

    @Override
    public Complex calculate(Calculator calc) {
        switch (calc.getOperation()) {
            case '+' -> {
                return new ComplexSum().sum(calc.getNumOne(), calc.getNumTwo());
            }
            case '-' -> {
                return new ComplexDiff().diff(calc.getNumOne(), calc.getNumTwo());
            }
            case '/' -> {
                return new ComplexDiv().div(calc.getNumOne(), calc.getNumTwo());
            }
            case '*' -> {
                return new ComplexMulti().multi(calc.getNumOne(), calc.getNumTwo());
            }
        }
        return null;
    }
}
