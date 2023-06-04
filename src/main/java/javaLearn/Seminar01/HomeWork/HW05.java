package javaLearn.Seminar01.HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class HW05 {
    public static void main(String[] args) {
        System.out.println("Enter text: ");
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().trim().split(" ");
        System.out.println("" + Arrays.toString(reverseText(str)));
        scanner.close();
    }
    /**
     * @apiNote Дана строка. Развернуть слова.
     * @param str заданная массив строк
     * @return результат
     */
    private static String[] reverseText(String[] str) {
        String[] result = new String[str.length];
        for (int i = 0; i < str.length; i++) {
            result[str.length - 1 - i] = str[i];
        }
        return result;
    }
}
