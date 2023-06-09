package javaLearn.Seminar05;

import java.util.HashMap;
import java.util.Map;

public class Ex01 {
    public static void main(String[] args) {
        String str = "qwewqe asdasd weqrqwe easda ew";
        task1(str);
    }

    /**
     * @apiNote  Посчитать количество вхождений каждого символа в текст.
     * @param str входная строка
     */
    private static void task1(String str) {
        Map<Character, Integer> mapCh = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                mapCh.putIfAbsent(str.charAt(i),0);
                mapCh.put(str.charAt(i), mapCh.get(str.charAt(i)) + 1);
//                if (!mapCh.containsKey(str.charAt(i))) {
//                    mapCh.put(str.charAt(i), 1);
//                } else {
//                    mapCh.put(str.charAt(i), mapCh.get(str.charAt(i)) + 1);
//                }
            }
        }
        for (Map.Entry<Character, Integer> entry : mapCh.entrySet()) {
            System.out.println(entry.getKey() + " встретилась: " + entry.getValue() + " раз(а)");
        }
    }
}
