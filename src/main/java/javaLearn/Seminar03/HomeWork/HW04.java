package javaLearn.Seminar03.HomeWork;

import java.util.*;

public class HW04 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Enter size array: ");
        int size = iScanner.nextInt();
        iScanner.close();
        List<Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array.add(random.nextInt(50 + 50) - 50);
        }
        System.out.println(array);
        System.out.println("max = " + Collections.max(array));
        System.out.println("min = " + Collections.min(array));
        System.out.println("average = " + array.stream().mapToInt(a -> a).average().orElse(0));
    }
}
