package javaLearn.Seminar02.HomeWork;

import java.util.Random;
import java.util.Scanner;

public class HW03 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        int size = iScanner.nextInt();
        iScanner.close();
        int[] array = new int[size];
        int sum = sumIndex(array);
        getArray(array, sum);
    }

    /**
     * @apiNote Заменить отрицательные элементы на сумму индексов двузначных элементов массива
     * @param array заданный массив
     * @return сумма индексов двухзначных элементов
     */
    private static int sumIndex(int[] array) {
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100 + 100) - 100;
            if ((-100 < array[i] && array[i] < -9) || (9 < array[i] && array[i] < 100)) sum += i;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return sum;
    }

    /**
     * @param array заданный массив
     * @param sum сумма индексов двухзначных элементов
     */
    private static void getArray(int[] array, int sum) {
        for (int j = 0; j < array.length; j++) {
            if(array[j] < 0) array[j] = sum;
            System.out.print(array[j] + " ");
        }
    }
}
