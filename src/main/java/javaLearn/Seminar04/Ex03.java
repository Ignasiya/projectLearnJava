package javaLearn.Seminar04;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList<Integer> linkedList = createList(n);
        System.out.println("linkedList = " + linkedList);
        int sum = 0;
        for (Integer el : linkedList) {
            if (el % 2 == 0) sum += el;
        }
    }

    /**
     * @param n количество элементов в созданном списке
     * @return новый список
     * @apiNote Построить однонаправленный список целых чисел. Найти сумму четных элементов списка.
     */
    private static LinkedList<Integer> createList(int n) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            linkedList.add(random.nextInt(10));
        }
        return linkedList;
    }
}
