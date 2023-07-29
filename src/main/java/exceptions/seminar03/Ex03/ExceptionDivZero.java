package exceptions.seminar03.Ex03;

/**
 * Создайте класс исключения, который будет выбрасываться при делении на 0.
 * Исключение должно отображать понятное для пользователя сообщение об ошибке.
 */
public class ExceptionDivZero extends ArithmeticException {
    public ExceptionDivZero() {
        super("Недопустимо делить на 0 ");
    }
}
