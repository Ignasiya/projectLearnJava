package javaLearn.Seminar06;

import java.util.*;

public class Ex01 {
    public static void main(String[] args) {
        // Дан массив чисел, посчитать процент уникальных чисел.
        // процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 5, 9, 4, 3, 4, 8, 7, 6, 4));
        Set<Integer> uniqueNum = new HashSet<>(numbers);
        System.out.println("numbers = " + numbers);
        System.out.println("uniqueNum = " + uniqueNum);
        int result = uniqueNum.size() * 100 / numbers.size();
        System.out.println("result = " + result);
    }
}
