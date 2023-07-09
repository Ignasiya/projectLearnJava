package JavaPLO.Seminar11.HomeWork.calculator.view;

import JavaPLO.Seminar09.Ex03.Game.Logging;
import JavaPLO.Seminar11.HomeWork.calculator.controllers.Controller;
import JavaPLO.Seminar11.HomeWork.calculator.data.Calculator.CalculatorComplex;
import JavaPLO.Seminar11.HomeWork.calculator.data.Calculator.CalculatorRational;
import JavaPLO.Seminar11.HomeWork.calculator.data.Complex;
import JavaPLO.Seminar11.HomeWork.calculator.data.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {
    private final Controller controller = new Controller();
    private Status status = Status.FIRST;

    private List<Log> logging = new ArrayList<>();
    public void start() {
        Scanner in = new Scanner(System.in).useDelimiter("\r?\n");;
        System.out.println("_________________________________________\n" +
                "Выберите с каким числами хотите работать: \n" +
                "[1]- рациональные числа\n" +
                "[2]- комплексные числа\n" +
                "[C]- для выхода");
        String key = in.next().strip().toLowerCase();
        switch (key) {
            case "1": partRational(in);
            case "2": partComplex(in);
            default: {
                in.close();
                break;
            }
        }
    }

    public void partRational(Scanner in) {
        System.out.println("______________RATIONAL_NUMBER______________\n" +
                "ИНСТУКЦИЯ:\n" +
                "значения вводите в формате: \n" +
                "<Число СимволОперации Число>");
        String key = in.next().toLowerCase();
        CalculatorRational calculator;
        double result = 0;
        while (!key.equals("c")) {
            if (status == Status.FIRST) {
                calculator = new CalculatorRational(key);
                status = Status.NEXT;
            } else calculator = new CalculatorRational(result, key);
            result = controller.sendRational(calculator);
            logging.add(new Log(calculator, result));
            System.out.print(result);
            key = in.next().toLowerCase();
        }
        in.nextLine();
        loggingGame(in, logging);
    }
    public void partComplex(Scanner in) {
        System.out.println("______________COMPLEX_NUMBER______________\n" +
                "ИНСТУКЦИЯ:\n" +
                "значения вводите в формате: \n" +
                "<Действительное Мнимое СимволОперации Действительное Мнимое>");
        String key = in.next().toLowerCase();
        CalculatorComplex calculator;
        Complex result = null;
        while (!key.equals("c")) {
            if (status == Status.FIRST) {
                calculator = new CalculatorComplex(key);
                status = Status.NEXT;
            } else calculator = new CalculatorComplex(result, key);
            result = controller.sendComplex(calculator);
            System.out.print(result);
            key = in.next().toLowerCase();
        }
        in.nextLine();
        loggingGame(in, logging);
    }

    private static void loggingGame(Scanner scanner, List<Log> logging) {
        System.out.print("Хотите посмотреть иторию игры? Y/N: ");
        String input = scanner.next();
        if (input.toUpperCase().equals("Y")) {
            for (Log log : logging) {
                System.out.println(log);
            }
        }
    }
}