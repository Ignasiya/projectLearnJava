package javaLearn.Seminar03.HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class HW05 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Enter size array: ");
        int size = iScanner.nextInt();
        iScanner.close();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i + 1;
        }
        permutation(array, array.length);
    }

    private static void permutation(int[] arrays, int size) {
        if (size < 2) {
            System.out.println(Arrays.toString(arrays));
        } else {
            for (int k = 0; k < size; k++) {
                swap(arrays, k, size - 1);
                permutation(arrays, size - 1);
                swap(arrays, size - 1, k);
            }
        }
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
