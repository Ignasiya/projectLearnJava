package JavaPLO.Seminar10.Ex03;

import java.util.List;

public class Calculator {

    public double sum(List<? extends Number> numbers) {
        double sum = 0.0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }
}
