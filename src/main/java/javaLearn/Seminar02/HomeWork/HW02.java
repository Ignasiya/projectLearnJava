package javaLearn.Seminar02.HomeWork;

import java.util.Random;
import java.util.Scanner;

public class HW02 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        int size = iScanner.nextInt();
        iScanner.close();
//        int[] array = {1, 2, 3, 5, 6, 7, 8, 9, 11, 14, 15, 20};
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100 + 100) - 100;
            System.out.print(array[i] + " ");
        }
        System.out.println("\n checkAscending(array) = " + checkAscending(array));
    }

    private static boolean checkAscending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) return false;
        }
        return true;
    }
}
