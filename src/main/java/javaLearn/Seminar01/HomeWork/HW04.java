package javaLearn.Seminar01.HomeWork;

public class HW04 {
    public static void main(String[] args) {
        System.out.println("Задано выражение: 2? + ?5 = 69 . Восстановить выражение до верного равенства.");
        boolean flag = true;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (20 + i + j * 10 + 5 == 69) {
                    flag = false;
                    System.out.println("2" + i + " + " + j + "5" + " = 69");
                }
            }
        }
        if (flag) System.out.println("\nРешений нет\n");
    }
}
