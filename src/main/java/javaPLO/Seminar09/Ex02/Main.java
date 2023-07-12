package javaPLO.Seminar09.Ex02;

public class Main {
    public static void main(String[] args) {
        Fruits fruits = Fruits.valueOf("BANANA");
        System.out.println("fruits = " + fruits);
        switch (fruits) {
            case APPLE, BANANA, ORANGE -> System.out.println("Это фрукт " + fruits.name);
            default -> System.out.println("Неопознанный фрукт");
        }
        for (Fruits value : Fruits.values()) {
            System.out.println(value);
        }
    }
}
