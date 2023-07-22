package patterns.templatePattern.CaffeineBeverage;

public class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Помешивай чай");
    }

    @Override
    void addCondiments() {
        System.out.println("Добавить лимон");
    }
}
