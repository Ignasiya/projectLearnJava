package javaLearn.Lesson01;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

public class Main {
    static public void main(String[] args) {
        String s = null; // Всегда класть в переменную значение, пустой оставлять нельзя
        int salary = 123456; // Занимает 4 байта +- 2 147....
        short age = 10;
        float e = 2.7f; // Вещественный тип, использовать суффикс f
        double pi = 3.1415D; // Можно использовать суффикс D
        char ch = '{';
        boolean flag = 123 < 234; // && - и, || - или, (| или &) - побитовая, ^ - разделительная дизюнкция
        String msg = "Hello world";

        // Неявная типизация
        var i = 123;
        System.out.println(getType(i));

        // Класс-обертка
        int j = 23_131_123;
        System.out.println(Integer.MAX_VALUE); // Обертка нужна для вызова методов у типа
        String c = "qwer";
        c.charAt(1);

        // Операции с данными
        int a = 123;
        System.out.println(a++); // 123 Сначало выводит, потом плюсует. Если ++a, то будет сначала плюсовать
        System.out.println(a); // 124
        // Префиксный и постфиксный энкримент

        int t = 123;
        t = t-- - --t; // 123 (122 - 121) 1 = (124) | --t-t--; 122 - 122  = (2)
        /*
         * a = 6
         * a -= (a--) - (--a)
         * Equivalent to:
         * a = a - ((a--) - (--a))
         *
         * Right side is evaluated first, left to right:
         *
         * a1 -> a--2 -> --a3 -> (a--)-(--a)4 -> a-((a--)-(--a)) 5
         *
         * Step 1: a evaluates to 6.
         * Step 2: a--; evaluates to 6, a becomes 5.
         * Step 3: --a; evaluates to 4, a becomes 4.
         * Step 4: 6 - 4; evaluates to 2.
         * Step 5: 6 - (6 - 4) evaluates to 2.
         * Final: a = 6 - (6 - 4); a becomes 4.
         */
        System.out.println(t);

        // Побитовые сдвиги
        int b = 8;
        // 1000
        b = b << 1;
        // 10000 = 16

        int d = 18;
        // 10010
        d = d >> 1;
        // 1001 = 9

        // b | d = 26;
        // 101
        // 010
        // 111

        // b & d = 0;
        // 101
        // 010
        // 000

        String n = "qwe1"; // длина 4, индексы 0..3
        // boolean m = n.length() >= 5 && n.charAt(4) == '1'; // называют быстрой,
        // если слева false - справа не смотрит
        boolean m = n.length() >= 5 & n.charAt(4) == '1'; // ошибка, потому что все равно посмотрим справа
        System.out.println(m);
        // Также по аналогии с || и |

        // Массивы
        int[] arr = new int[10]; // 10
        arr = new int[] { 1, 2, 3, 4, 5 }; // 5
        arr[3] = 13;
        int brr[]; // Можно так написать

        // Многомерные массивы
        // int[][] array = new int[3][5];
        int[] array[] = new int[3][5]; // 3 строки и 5 столбцов

        // Преобразования
        byte r = Byte.parseByte("12"); // 12, но байт хранит до 255
        int[] g = new int[10];
        // double[] h = g; - нельзя, читай инварианты типов, ковариантность и контрвариантность

        // Получение данных из терминала
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine(); // nextInt() и т.д.
        System.out.printf("Привет, %s!\n", name);
        boolean flagint = iScanner.hasNextInt(); // Проверка если пользователь банан
        iScanner.close();

        // Форматированный вывод
        String ss = "qwerty";
        int aa = 123;
        String q = ss+aa; // qwerty123 Мы получили 4 строки (ss, aa, ss+aa, q)
        String res = String.format("%d + %d = %d \n", ss, aa, q); // %d маска где стоит аргумент
        System.out.printf("%d + %d = %d \n", ss, aa, q); // print format

        // Область видимости переменных
        int y = 123;
        {
            int o = 222;
            System.out.println(o + y);
        }
        int o = 123;

        // Функции и методы
        lib.sayHi(); // Hi

        // Управляющие конструкции
        int min = a < b ? a : b; // Тернарный оператор (Условие ? Да : Нет)
        int mounth = 1;
        switch (mounth) {
            case 1:
            case 2:
            case 3:
                System.out.println("a");
                break;
            case 10: System.out.println("b");
                break;
            default:
                break;
        }

        // Циклы
        int value = 312;
        while (value != 0) {
            value /= 10;
        }

        do {
            value /= 10;
        } while (value != 0); // Сначала делает, потом проверяет

        // foreach
        for (int item : arr) {
            item = 13; // Не работает
            System.out.println(item); // Перебирает элементы коллекции
        }

        // Быдло кодинг
        for (int index = 0; index < 10; index++) {
            if (index % 2 == 0) {
                continue; // возвращаемся в начало цикла
                // break; ближайший цикл завершен
            }
            System.out.println(index);
        }

        // Работа с файлами
        try (FileWriter fw = new FileWriter("file.txt", false)) {
            fw.write("line 1"); // писать
            fw.append('\n'); // добавлять
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    // Определение типа переменной
    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }
}