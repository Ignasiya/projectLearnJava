package javaPLO.Seminar08.HomeWork.Obstacles;

public class Wall extends Obstacles{
    private final int height;

    public Wall(String name, int height) {
        super(name);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "name=" + name +
                ", dist=" + height + '\n';
    }
}
