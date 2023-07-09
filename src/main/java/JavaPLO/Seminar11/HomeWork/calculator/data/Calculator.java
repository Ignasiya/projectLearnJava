package JavaPLO.Seminar11.HomeWork.calculator.data;

public class Calculator {

    private static Calculator uniqueInstance;
    private double numOne;
    private double numTwo;
    private char operation;

    public Calculator(String in) {
        char[] chars = in.toCharArray();
        String temp = "";
        for (char ch : chars) {
            if (ch == '/' || ch == '*' || ch == '+' || ch == '-') {
                this.operation = ch;
                this.numOne = Double.parseDouble(temp.strip());
                temp = "";
            }
            temp += ch;
        }
        this.numTwo = Double.parseDouble(temp.strip());
    }
    public Calculator(double num, String in) {
        char[] chars = in.toCharArray();
        String temp = "";
        for (char ch : chars) {
            if (ch == '/' || ch == '*' || ch == '+' || ch == '-') {
                this.operation = ch;
                temp = "";
            }
            temp += ch;
        }
        this.numTwo = Double.parseDouble(temp.strip());
    }

    public static Calculator getInstance(String in) {
        if (uniqueInstance == null) uniqueInstance = new Calculator(in);
        return uniqueInstance;
    }

    @Override
    public String toString() {
        return numOne + " " + operation + " " + numTwo;
    }
}
