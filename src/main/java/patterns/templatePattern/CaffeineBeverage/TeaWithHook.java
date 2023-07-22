package patterns.templatePattern.CaffeineBeverage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeaWithHook extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Помешивай чай");
    }

    @Override
    void addCondiments() {
        System.out.println("Добавить лимон");
    }

    @Override
    public boolean customerWantsCondiments() {
        String answer = getUserInput();
        return answer.toUpperCase().startsWith("Y");
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("Хотите чай с лимоном (Y/N)");

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
