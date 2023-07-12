package javaPLO.Seminar08.Ex02;

public class Cat extends Animal{
    static int count;
    int runDistance;


    public Cat(String name, int runDistance) {
        super(name);
        if (runDistance > 500) {
            this.runDistance = 200;
            System.out.println("Введенное значение больше максимального значения, установленно максимальное");
        } else this.runDistance = runDistance;
        count++;
    }

    @Override
    public void run(int distance) {
        if (distance > runDistance) System.out.println(super.name + " не сможет пробежать");
        else System.out.println(super.name + " пробежал");
    }

    @Override
    public void swim(int distance) {
        System.out.println(super.name + " не умеет плавать");
    }
}
