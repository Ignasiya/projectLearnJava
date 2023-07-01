package JavaPLO.Seminar08.Ex02;

public class DomesticCat extends Cat{
    static int count;

    public DomesticCat(String name, int runDistance) {
        super(name, runDistance);
        count++;
    }
}
