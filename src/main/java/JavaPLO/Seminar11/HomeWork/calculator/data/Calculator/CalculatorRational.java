package JavaPLO.Seminar11.HomeWork.calculator.data.Calculator;

public class CalculatorRational extends Calculator<Double> {
    private double numOne;
    private double numTwo;

    public CalculatorRational(String in) {
        char[] chars = in.toCharArray();
        String temp = "";
        for (char ch : chars) {
            if (ch == '/' || ch == '*' || ch == '+' || ch == '-') {
                super.operation = ch;
                this.numOne = Double.parseDouble(temp.strip());
                temp = "";
            } else temp += ch;
        }
        this.numTwo = Double.parseDouble(temp.strip());
    }
    public CalculatorRational(double numOne, String in) {
        this.numOne = numOne;
        char[] chars = in.toCharArray();
        String temp = "";
        for (char ch : chars) {
            if (ch == '/' || ch == '*' || ch == '+' || ch == '-') {
                super.operation = ch;
                temp = "";
            } else temp += ch;
        }
        this.numTwo = Double.parseDouble(temp.strip());
    }

    public Double getNumOne() {
        return numOne;
    }

    public Double getNumTwo() {
        return numTwo;
    }

    @Override
    public String toString() {
        return numOne + " " + operation + " " + numTwo;
    }
}