package exceptions.seminar03.Ex04;

public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException() {
        super("Размер двумерного массива не равен 4х4");
    }
}
