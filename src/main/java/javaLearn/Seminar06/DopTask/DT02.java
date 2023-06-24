package javaLearn.Seminar06.DopTask;

import java.util.Arrays;

public class DT02 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int count = 1;
        for (int i = 2; i <= arr.length; i++) {
            count *= i;
        }
        System.out.println(count + " - перестановок");
        int maxIndex = arr.length - 1;
        for (int i = 0; i < count; i++) {
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[maxIndex - 1];
            arr[maxIndex - 1] = temp;
            System.out.println(Arrays.toString(arr));
            if (maxIndex < 2) {
                maxIndex = arr.length - 1;
            } else {
                maxIndex--;
            }
        }
    }

}
