package algotithmsAndData.Seminar01;
import java.util.ArrayList;
import java.util.List;

public class Ex01 {
    /* Необходимо написать алгоритм, считающий сумму всех чисел от 1 до N.
    Согласно свойствам линейной сложности, количество итераций цикла будет
    линейно изменяться относительно изменения размера N. */

    public static void main (String[] args) {
        List<Integer> availableDivinder = findSimpleNumbers(10);
        for (Integer integer : availableDivinder) {
            System.out.println(integer);
        }
    }

    public static List<Integer> findSimpleNumbers(int n){
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            boolean simple = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    simple = false;
                    break;
                }
            }
            if (simple) {
                result.add(i);
            }
        }
        return result;
    }
}
