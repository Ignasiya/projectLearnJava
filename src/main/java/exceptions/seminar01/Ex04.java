package exceptions.seminar01;

/**
 * Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
 * Метод должен пройтись по каждому элементу и проверить что он не равен null.
 * А теперь реализуйте следующую логику:
 * Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
 * Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”
 */
public class Ex04 {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, null, 7, 8, null, 10};
        checkArray(array);
    }

    public static void checkArray(Integer[] array) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null)
                res.append("По индексу ")
                        .append(i)
                        .append(" null")
                        .append("\n");
        }
        if (res.length() > 0) System.out.println(res);
        else throw new RuntimeException("Масиив без null");
    }
}
