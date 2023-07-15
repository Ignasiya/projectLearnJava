package javaPLO.seminar12.ex01.formatter;

import javaPLO.seminar12.ex01.book.ElectronBook;

public class HTMLFormatter implements Formatter {
    @Override
    public void toFormat(ElectronBook book) {
        System.out.println("Форматировали " + book + " в HTML");
    }
}
