package javaLearn.Seminar02.HomeWork;

public class Vector {
    public double x;
    public double y;
    public double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector() {
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    /**
     * @param vector2 с которым происходит взаимодействие
     * @return сумма векторов
     */
    public Vector vectorSum(Vector vector2) {
        return new Vector(x + vector2.x, y + vector2.y, z + vector2.z);
    }

    /**
     * @param vector2 с которым происходит взаимодействие
     * @return разность векторов
     */
    public Vector vectorDiff(Vector vector2) {
        return new Vector(x - vector2.x, y - vector2.y, z - vector2.z);
    }
}
