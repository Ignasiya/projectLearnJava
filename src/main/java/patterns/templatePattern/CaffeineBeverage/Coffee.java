package patterns.templatePattern.CaffeineBeverage;

public class Coffee extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Фильтрование кофе через фильтр");
    }

    @Override
    void addCondiments() {
        System.out.println("Добавить сахар и молоко");
    }
}
