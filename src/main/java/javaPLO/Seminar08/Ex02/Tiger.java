package javaPLO.Seminar08.Ex02;

public class Tiger extends Cat {
    static int count;

    public Tiger(String name, int runDistance) {
        super(name, runDistance);
        count++;
    }
}
