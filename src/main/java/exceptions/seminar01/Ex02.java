package exceptions.seminar01;

/**
 * Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение. Метод ищет в массиве
 * заданное значение и возвращает его индекс. При этом, например:
 * если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
 * если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
 * если вместо массива пришел null, метод вернет -3
 * придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.
 * Напишите метод, в котором реализуйте взаимодействие с пользователем. То есть, этот метод запросит искомое число
 * у пользователя, вызовет первый, обработает возвращенное значение и покажет читаемый результат пользователю.
 * Например, если вернулся -2, пользователю выведется сообщение: “Искомый элемент не найден”.
 */
public class Ex02 {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result = sizeArray(array, 5, 10);
        exceptionResult(result);
    }

    private static void exceptionResult(int result) {
        switch (result) {
            case -3 -> System.out.println("массив пустой");
            case -2 -> System.out.println("элемент не найден");
            case -1 -> System.out.println("длина массива меньше минимального");
            default -> System.out.println("индекс " + result);
        }
    }

    private static int sizeArray(Integer[] array, int find, int min) {
        if (array == null) return -3;
        if (array.length < min) return -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == find) return i;
        }
        return -2;
    }
}
