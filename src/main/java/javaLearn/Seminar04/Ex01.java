package javaLearn.Seminar04;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            linkedList.add(scanner.nextInt());
        }
        System.out.println("linkedList = " + linkedList);
        scanner.close();
        System.out.println("linkedList.peek() = " + linkedList.peek()); // выводит элемент
        System.out.println("linkedList.pop() = " + linkedList.pop()); // вырезает и показывает элемент
        linkedList.add(2); // в конец
        linkedList.push(2);
        linkedList.addLast(3); // в конец
        linkedList.addFirst(3); // в начало
        System.out.println("linkedList = " + linkedList);
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("linkedList = " + linkedList);
        System.out.println("linkedList.contains(3) = " + linkedList.contains(3));
    }


}
