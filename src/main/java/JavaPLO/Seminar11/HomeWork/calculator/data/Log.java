package JavaPLO.Seminar11.HomeWork.calculator.data;

public class Log<N> {
    static int count;
    private N numbers;
    private N result;


    public Log(N numbers, N result) {
        count++;
        this.numbers = numbers;
        this.result = result;
    }

    @Override
    public String toString() {
        return count + " " + numbers + " " + result + "\n";
    }
}
