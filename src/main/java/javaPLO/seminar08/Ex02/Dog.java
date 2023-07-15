package javaPLO.seminar08.Ex02;

public class Dog extends Animal {

    static int count;
    int runDistance;
    int swimDistance;

    public Dog(String name, int runDistance, int swimDistance) {
        super(name);
        if (runDistance > 500) {
            this.runDistance = 500;
            System.out.println("Введенное значение больше максимального значения, установленно максимальное");
        } else this.runDistance = runDistance;
        if (swimDistance > 10) {
            this.swimDistance = 10;
            System.out.println("Введенное значение больше максимального значения, установленно максимальное");
        } else this.swimDistance = swimDistance;
        count++;
    }

    @Override
    public void run(int distance) {
        if (distance > runDistance) System.out.println(super.name + " не сможет пробежать");
        else System.out.println(super.name + " пробежал");
    }

    @Override
    public void swim(int distance) {
        if (distance > runDistance) System.out.println(super.name + " не сможет проплыть");
        else System.out.println(super.name + " проплыл");
    }
}
