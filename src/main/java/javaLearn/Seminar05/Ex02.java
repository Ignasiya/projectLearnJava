package javaLearn.Seminar05;

import java.util.HashMap;
import java.util.Map;

public class Ex02 {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 1, 6, 4, 2, 8, 5, 9};
        System.out.println("checkArrayDouble(array) = " + checkArrayDouble(array));
    }

    /**
     * @param array входной массив
     * @apiNote Определить, есть ли в массиве дубликаты, если найден хоть один, вывести на экран (true),
     * В противном случае (false).
     */
    private static boolean checkArrayDouble(int[] array) {
        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (integerMap.containsKey(array[i])) {
                return true;
            } else {
                integerMap.put(array[i], 1);
            }
        }
        return false;
    }
}
