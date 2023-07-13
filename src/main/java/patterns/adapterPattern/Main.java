package patterns.adapterPattern;

import patterns.adapterPattern.data.*;

public class Main {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("Индюк:");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nУтка:");
        duck.quack();
        duck.fly();

        System.out.println("\nАдаптер индюк");
        turkeyAdapter.fly();
        turkeyAdapter.quack();
    }
}
