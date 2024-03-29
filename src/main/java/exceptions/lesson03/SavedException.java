package exceptions.lesson03;

import java.io.IOException;
import java.util.Date;

public class SavedException extends IOException {
    private Date startDate;

    public SavedException(String message, Date startDate, Exception e) {
        super("ошибка с сообщением" + message, e);
        this.startDate = startDate;
    }

    public Date getStartDate() {
        return startDate;
    }
}
