package javaPLO.seminar13.homework.calculator.controllers;

import javaPLO.seminar13.homework.calculator.data.CalculatorComplex;
import javaPLO.seminar13.homework.calculator.data.Complex;
import javaPLO.seminar13.homework.calculator.model.ModelComplex;

public class V1Controller implements Controller {

    public V1Controller() {}

    public Complex sendComplex(CalculatorComplex calculator) {
        ModelComplex model = new ModelComplex();
        return model.calculate(calculator);
    }
}
