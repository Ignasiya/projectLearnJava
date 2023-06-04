package javaLearn.Seminar01.HomeWork;

import java.util.Scanner;

public class HW03 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNum = iScanner.nextInt();
        System.out.print("Enter the second number: ");
        int secondNum = iScanner.nextInt();
        System.out.print("Enter the operator: ");
        String operator = iScanner.next();
        iScanner.close();
        System.out.printf("Result = %d", calculator(firstNum, secondNum, operator));
    }

    /**
     * @apiNote Реализовать простой калькулятор
     * @param a первое число
     * @param b второе число
     * @param o операция калькулятора
     * @return результат
     */
    private static int calculator(int a, int b, String o) {
        int result = 0;
        switch (o) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                System.out.println("An incorrect calculator operation value was entered");
                return -1;
        }
        return result;
    }
}
