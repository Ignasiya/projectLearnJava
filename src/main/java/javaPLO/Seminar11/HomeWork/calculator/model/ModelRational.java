package javaPLO.Seminar11.HomeWork.calculator.model;

import javaPLO.Seminar11.HomeWork.calculator.data.Calculator.CalculatorRational;
import javaPLO.Seminar11.HomeWork.calculator.data.OperaionRational.*;

public class ModelRational extends Model<CalculatorRational, Double> {

    @Override
    public Double calculate(CalculatorRational calc) {
        switch (calc.getOperation()) {
            case '+' -> {
                return new RationalSum().sum(calc.getNumOne(), calc.getNumTwo());
            }
            case '-' -> {
                return new RationalDiff().diff(calc.getNumOne(), calc.getNumTwo());
            }
            case '/' -> {
                return new RationalDiv().div(calc.getNumOne(), calc.getNumTwo());
            }
            case '*' -> {
                return new RationalMulti().multi(calc.getNumOne(), calc.getNumTwo());
            }
        }
        return null;
    }
}
