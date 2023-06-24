package javaLearn.Seminar06;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex02 {
    public static void main(String[] args) {
//        Найти пересечение двух множеств
        Set<Integer> setOne = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> setTwo = new HashSet<>(Arrays.asList(3, 5, 6, 7));
        Set<Integer> retain = new HashSet<>(setOne);
        retain.retainAll(setTwo);
        System.out.println("retain = " + retain);
        System.out.println("setOne = " + setOne);
        System.out.println("setTwo = " + setTwo);
    }
}
