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
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100 + 100) - 100;
            if ((-100 < array[i] && array[i] < -9) || (9 < array[i] && array[i] < 100)) sum += i;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int j = 0; j < size; j++) {
            if(array[j] < 0) array[j] = sum;
            System.out.print(array[j] + " ");
        }
    }
}
