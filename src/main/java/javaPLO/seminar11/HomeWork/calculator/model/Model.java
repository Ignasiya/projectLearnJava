package javaPLO.seminar11.HomeWork.calculator.model;

import javaPLO.seminar11.HomeWork.calculator.data.Calculator.Calculator;

public abstract class Model<N extends Calculator<E>, E> {


    public abstract E calculate(N calculator);
}
