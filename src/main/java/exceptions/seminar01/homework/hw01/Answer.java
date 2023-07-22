package exceptions.seminar01.homework.hw01;

/**
 * Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.
 * Метод arrayOutOfBoundsException - Ошибка, связанная с выходом за пределы массива
 * Метод divisionByZero - Деление на 0
 * Метод numberFormatException - Ошибка преобразования строки в число
 * Важно: они не должны принимать никаких аргументов
 */
public class Answer {
    public static void arrayOutOfBoundsException() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(array[10]);
    }

    public static void divisionByZero() {
        int result = 10 / 0;
        System.out.println(result);
    }

    public static void numberFormatException() {
        String result = "Привет";
        System.out.println(Integer.parseInt(result));
    }
}
