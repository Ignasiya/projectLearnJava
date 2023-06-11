package javaLearn.Seminar03.HomeWork.HW03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Гарри Поттер и узник Азкабана", "Роулинг", 9000, 2019, 530);
        Book book2 = new Book("Зеленая миля", "Кинг", 5000, 2014, 384);
        Book book3 = new Book("Унесенные ветром", "Митчелл", 4000, 1982, 1088);
        Book book4 = new Book("Шерлок Холмс", "Конан Дойл", 7000, 2019, 941);
        Book book5 = new Book("Свита Короля", "Сакавич", 2000, 2021, 563);
        Book book6 = new Book("Гарри Поттер и Принц-полукровка", "Роулинг", 6000, 2005, 976);
        Book book7 = new Book("Прислуга", "Стокетт", 1000, 2011, 576);
        Book book8 = new Book("Возвращение государя", "Толкин", 3000, 1994, 350);
        Book book9 = new Book("Благословение небожителей", "Тунсю", 8000, 2022, 416);
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        books.add(book7);
        books.add(book8);
        books.add(book9);
        List<String> result = findBook(books);
        for (String s : result) {
            System.out.print(s + "; ");
        }
    }

    /**
     * @param books список книг
     * @return название книг
     * @apiNote Найти названия книг, в которых простое количество страниц,
     * фамилия автора содержит «А» и год издания после 2010 г, включительно
     */
    private static List<String> findBook(List<Book> books) {
        List<String> result = new ArrayList<>();
        for (Book book : books) {
            if (
                    simpleCountPage(book.getCountPages())
                    && book.getYear() >= 2010
                    && book.getSurnameAuthor().toUpperCase().contains("А")
            ) {
                result.add(book.getNameBook());
            }
        }
        return result;
    }

    /**
     * @param n число
     * @return проверка простое ли оно
     */
    private static boolean simpleCountPage(int n) {
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i <= Math.sqrt(n); i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
}
