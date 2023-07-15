package javaPLO.seminar11.HomeWork.calculator.controllers;

import javaPLO.seminar11.HomeWork.calculator.data.Calculator.CalculatorComplex;
import javaPLO.seminar11.HomeWork.calculator.data.Calculator.CalculatorRational;
import javaPLO.seminar11.HomeWork.calculator.data.Complex;
import javaPLO.seminar11.HomeWork.calculator.model.ModelComplex;
import javaPLO.seminar11.HomeWork.calculator.model.ModelRational;

public class Controller {

    public Controller() {}

    public double sendRational(CalculatorRational calculator) {
        ModelRational model = new ModelRational();
        return model.calculate(calculator);
    }

    public Complex sendComplex(CalculatorComplex calculator) {
        ModelComplex model = new ModelComplex();
        return model.calculate(calculator);
    }
}
