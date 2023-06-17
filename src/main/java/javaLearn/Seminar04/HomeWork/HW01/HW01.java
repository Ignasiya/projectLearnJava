package javaLearn.Seminar04.HomeWork.HW01;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class HW01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList<Integer> linkedList = createList(n);
        System.out.println("linkedList = " + linkedList);
        reverseNum(linkedList);
        System.out.println("linkedList = " + linkedList);
    }

    /**
     * @param linkedList список
     * @apiNote Вывести список на экран в перевернутом виде
     */
    private static void reverseNum(LinkedList<Integer> linkedList) {
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.add(i, linkedList.pollLast());
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
