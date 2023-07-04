package Patterns.StrategyPattern.QuackBehavior;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Тишина");
    }
}
