package patterns.templatePattern.CaffeineBeverage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Фильтрование кофе через фильтр");
    }

    @Override
    void addCondiments() {
        System.out.println("Добавить сахар и молоко");
    }

    @Override
    public boolean customerWantsCondiments() {
        String answer = getUserInput();
        return answer.toUpperCase().startsWith("Y");
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("Хотите кофе с молоком и сахаром (Y/N)");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            System.err.println("Ошибка ввода-вывода при попытке прочитать ваш ответ");
        }
        if (answer == null) return "no";
        return answer;
    }
}
