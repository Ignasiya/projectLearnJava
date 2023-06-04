package javaLearn.Seminar01;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("count = " + zadanie2(n, scanner));
    }
    /**
     * @apiNote Дана последовательность N целых чисел. Найти количество положительных чисел, после которых следует отрицательное число.
     * @param n заданное число
     * @return результат
     */
    private static int zadanie2(int n, Scanner scanner) {
        int count = 0;
        int a = 0;
        int b = 0;
        a = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            b = scanner.nextInt();
            if (a > 0 && b < 0) count ++;
            a = b;
        }
        scanner.close();
        return count;
    }
}
