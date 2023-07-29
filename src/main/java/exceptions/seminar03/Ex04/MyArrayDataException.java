package exceptions.seminar03.Ex04;

public class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException(int a, int b) {
        super("Не удалось преобразовать в int по индекам [" + a + "], [" + b + "]");
    }
}
