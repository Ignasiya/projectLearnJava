package exceptions.seminar01;

import java.util.Scanner;

/**
 * Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
 * Если длина массива меньше некоторого заданного минимума, метод возвращает -1,
 * в качестве кода ошибки, иначе - длину массива.
 */
public class Ex01 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(sizeArray(array));
    }

    public static int sizeArray(int[] array) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите минимум: ");
        int key = in.nextInt();
        if (array.length < key) return -1;
        return array.length;
    }
}
