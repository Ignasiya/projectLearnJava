package javaLearn.Seminar06.Ex04;

public class Faren implements Converter{
    @Override
    public double convertValue(double baseValue) {
        return baseValue * 9.0 / 5.0 + 32;
    }
}
