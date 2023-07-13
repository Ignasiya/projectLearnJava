package patterns.adapterPattern.data;

public class MallardDuck implements Duck {

    @Override
    public void fly() {
        System.out.println("Я летаю");
    }

    @Override
    public void quack() {
        System.out.println("Кря");
    }
}
