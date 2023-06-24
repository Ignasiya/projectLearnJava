package JavaPLO.Lesson07.Ex002;

public class Point2D {
    int x, y;

    public Point2D(int valueX, int valueY) {
        x = valueX;
        y = valueY;
    }

    public Point2D(int value) {
        this(value, value);
    }

    public Point2D() {
        this(0);
    }

    private String getInfo() {
        return String.format("x: %d, y: %d", x, y);
    }

    @Override
    public String toString() {
        return getInfo();
    }
}
