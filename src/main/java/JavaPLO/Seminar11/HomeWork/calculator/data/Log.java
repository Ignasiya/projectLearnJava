package JavaPLO.Seminar11.HomeWork.calculator.data;

public class Log<N> {
    static int count = 1;
    private int id;
    private N numbers;
    private N result;


    public Log(N numbers, N result) {
        this.id = count++;
        this.numbers = numbers;
        this.result = result;
    }

    @Override
    public String toString() {
        return id + " " + numbers + " = " + result;
    }
}
