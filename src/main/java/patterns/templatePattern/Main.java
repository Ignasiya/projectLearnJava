package patterns.templatePattern;

import patterns.templatePattern.CaffeineBeverage.CaffeineBeverage;
import patterns.templatePattern.CaffeineBeverage.CoffeeWithHook;
import patterns.templatePattern.CaffeineBeverage.TeaWithHook;

public class Main {
    public static void main(String[] args) {
        CaffeineBeverage tea = new TeaWithHook();
        CaffeineBeverage coffee = new CoffeeWithHook();

        System.out.println("\nГотовим чай...");
        tea.prepareRecipe();

        System.out.println("\nГотовим кофэ...");
        coffee.prepareRecipe();
    }
}
