package algotithmsAndData.Seminar02;
import java.util.Arrays;
import java.util.Date;

public class Ex01 {
    public static void main(String[] args) {
        int[] bubSo = new int[] { 0, 2, 6, 4, 3, 2, 7, 8, 56, 4, 22, 156, 6, 4321 };
        bubbleSort(bubSo);
        System.out.println(Arrays.toString(bubSo));

        System.out.println();
        System.out.println(binarySearch(bubSo, 8, 0, bubSo.length - 1));
    }

    public static void bubbleSort(int[] a) {
        int lastSwap = a.length - 1;
        for (int i = 1; i < a.length; i++) {
            boolean is_sorted = true;
            int currentSwap = -1;
            for (int j = 0; j < lastSwap; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    is_sorted = false;
                    currentSwap = j;
                }
            }
            if (is_sorted)
                return;
            lastSwap = currentSwap;
        }
    }

    public static void quickSort(int[] array, int start, int end) {
        int pivot = array[(end - start) / 2 + start];
        int left_position = start;
        int right_position = end;
        while (left_position <= right_position) {
            while (array[left_position] < pivot) {
                left_position++;
            }
            while (array[right_position] > pivot) {
                right_position--;
            }
            if (left_position <= right_position) {
                if (left_position < right_position) {
                    int temp = array[right_position];
                    array[right_position] = array[left_position];
                    array[left_position] = temp;
                }
                left_position++;
                right_position--;
            }
        }
        if (start < right_position) {
            quickSort(array, start, right_position);
        }
        if (end > left_position) {
            quickSort(array, left_position, end);
        }
    }

    public static void time(String[] args) {
        for (int i = 10000; i <= 100000; i = i + 10000) {
            int[] array = new int[i];
            for (int j = 0; j < array.length; j++) {
                array[j] = (int) (Math.random() * 10000);
            }
            Date startDate = new Date();
            bubbleSort(array);
            Date endDate = new Date();
            long bubbleSortDuration = endDate.getTime() - startDate.getTime();

            for (int j = 0; j < array.length; j++) {
                array[j] = (int) (Math.random() * 10000);
            }
            startDate = new Date();
            quickSort(array, 0, array.length - 1);
            endDate = new Date();
            long quickSortDuration = endDate.getTime() - startDate.getTime();
            System.out.printf("i: %s, bubble sort duration: %s, quick sort duration: %s%n", i, bubbleSortDuration,
                    quickSortDuration);
        }
    }

    public static int binarySearch(int[] array, int value, int min, int max) {
        int midpoint;

        if (max < min) {
            return -1;
        } else {
            midpoint = (max - min) / 2 + min;
        }

        if (array[midpoint] < value) {
            return binarySearch(array, value, midpoint + 1, max);
        } else {
            if (array[midpoint] > value) {
                return binarySearch(array, value, min, midpoint - 1);
            } else {
                return midpoint;
            }
        }
    }
}
