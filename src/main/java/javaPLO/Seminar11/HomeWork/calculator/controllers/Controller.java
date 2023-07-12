package javaPLO.Seminar11.HomeWork.calculator.controllers;

import javaPLO.Seminar11.HomeWork.calculator.data.Calculator.CalculatorComplex;
import javaPLO.Seminar11.HomeWork.calculator.data.Calculator.CalculatorRational;
import javaPLO.Seminar11.HomeWork.calculator.data.Complex;
import javaPLO.Seminar11.HomeWork.calculator.model.ModelComplex;
import javaPLO.Seminar11.HomeWork.calculator.model.ModelRational;

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
