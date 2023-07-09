package JavaPLO.Seminar11.HomeWork.calculator.model;

import JavaPLO.Seminar11.HomeWork.calculator.data.Calculator.Calculator;

public abstract class Model<N extends Calculator<E>, E> {


    public abstract E calculate(N calculator);
}
