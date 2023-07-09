package JavaPLO.Seminar11.HomeWork.calculator.data.Calculator;

public abstract class Calculator<N> {

    protected N numOne;
    protected N numTwo;
    protected char operation;

    public char getOperation() {
        return operation;
    }

    abstract public N getNumOne();

    abstract public N getNumTwo();

}