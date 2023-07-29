package exceptions.seminar03.Ex03;

/**
 * Создайте класс исключений, которое будет возникать при обращении к пустому элементу в массиве ссылочного типа.
 * Исключение должно отображать понятное для пользователя сообщение об ошибке
 */
public class ExceptionNull extends NullPointerException {
    public ExceptionNull() {
        super("Обращаетесь к пустому элементу");
    }

    public ExceptionNull(int index) {
        super("Обращаетесь к пустому элементу " + index);
    }
}
