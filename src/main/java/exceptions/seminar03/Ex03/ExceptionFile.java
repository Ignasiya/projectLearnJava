package exceptions.seminar03.Ex03;

import java.io.FileNotFoundException;

/**
 * Создайте класс исключения, которое будет возникать при попытке открыть несуществующий файл.
 * Исключение должно отображать понятное для пользователя сообщение об ошибке.
 */
public class ExceptionFile extends FileNotFoundException {
    public ExceptionFile() {
        super("Файл не найден");
    }

    public ExceptionFile(String path) {
        super("Файл не найден -> " + path);
    }
}

