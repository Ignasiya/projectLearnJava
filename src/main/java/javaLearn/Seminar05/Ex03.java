package javaLearn.Seminar05;

import java.util.HashMap;
import java.util.Map;

public class Ex03 {
    public static void main(String[] args) {
        Map<Character, Integer> numberRome = new HashMap<>();
        numberRome.put('I', 1);
        numberRome.put('V', 5);
        numberRome.put('X', 10);
        numberRome.put('L', 50);
        numberRome.put('C', 100);
        numberRome.put('D', 500);
        numberRome.put('M', 1000);
        String s = "MCMXCIV";
        System.out.println("translateRomeNumber = " + translateRomeNumber(numberRome, s));
    }

    /**
     * @apiNote Написать перевод их Римских цифр в арабские
     * @param numberRome словарь сопоставлений
     * @param s входная римская цифра
     * @return арабская цифра
     */
    private static int translateRomeNumber(Map<Character, Integer> numberRome, String s) {
        int res = numberRome.get(s.charAt(s.length() - 1));
        for (int i = 0; i < s.length() - 1; i++) {
            if (numberRome.containsKey(s.charAt(i))) {
                if (numberRome.get(s.charAt(i)) < numberRome.get(s.charAt(i + 1))) {
                    res -= numberRome.get(s.charAt(i));
                } else {
                    res += numberRome.get(s.charAt(i));
                }
            }
        }
        return res;
    }
}
