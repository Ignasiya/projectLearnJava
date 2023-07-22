package exceptions.seminar01;

/**
 * Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
 * Необходимо посчитать и вернуть сумму элементов этого массива.
 * При этом накладываем на метод 2 ограничения: метод может работать только с квадратными массивами
 * (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1.
 * Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.
 */
public class Ex03 {
    public static void main(String[] args) {
        Integer[][] array = {
                {0, 1, 1, 0},
                {0, 0, 1, 0},
                {0, 1, 1, 0},
                {0, 1, 0, 1}};
        System.out.println(sumArray(array));
    }

    private static Integer sumArray(Integer[][] array) {
        int result = 0;
        if (array.length == array[0].length){
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    if (array[i][j] != 0 && array[i][j] != 1)
                        throw new RuntimeException("Число отличное от 0 или 1");
                    else result += array[i][j];
                }
            }
        } else{
            throw new RuntimeException("Не квадратный");
        }
        return result;
    }
}
