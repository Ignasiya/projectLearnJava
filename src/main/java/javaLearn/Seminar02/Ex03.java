package javaLearn.Seminar02;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Enter size array: ");
        int size = iScanner.nextInt();
        System.out.println(zadanie3(size, iScanner));
        iScanner.close();
    }

    /**
     * @apiNote Дана последовательность из N целых чисел. Найти сумму чисел,
     * оканчивающихся на 5, перед которыми идет четное число.
     * @param size колличество чисел
     * @param iScanner консоль с клавиатуры
     * @return сумма
     */
    private static int zadanie3(int size, Scanner iScanner) {
        int sum = 0;
        int n1 = iScanner.nextInt();
        for (int i = 0; i < size - 1; i++) {
            int n2 = iScanner.nextInt();
            if (n2 % 10 == 5 && n1 % 2 == 0) sum += n2;
            n1 = n2;
        }
        return sum;
    }
}
