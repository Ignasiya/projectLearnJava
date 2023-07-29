package exceptions.seminar03.Ex02;

import java.io.IOException;

/**
 * AutoCloseable автоматически закрывает класс
 */
public class Counter implements AutoCloseable {
    private Integer count;

    public Counter(int count) {
        this.count = count;
    }

    @Override
    public void close() throws Exception {
        this.count = null;
    }

    private void checkCLose() throws IOException {
        if (this.count == null) {
            throw new IOException("Экземпляр закрыт");
        }
    }

    public void add() throws IOException {
        checkCLose();
        this.count++;
    }

    public Integer getCount() throws IOException {
        checkCLose();
        return count;
    }
}
