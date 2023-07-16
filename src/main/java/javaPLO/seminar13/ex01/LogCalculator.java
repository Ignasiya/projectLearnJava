package javaPLO.seminar13.ex01;

public class LogCalculator implements Calculable {
    private Calculable decorated;
    private Loggable logger;

    public LogCalculator(Calculable decorated, Loggable logger) {
        this.decorated = decorated;
        this.logger = logger;
    }

    @Override
    public Calculable sum(int arg) {
        logger.log("вывоза метода sum с параметром = " + arg);
        return decorated.sum(arg);
    }

    @Override
    public Calculable multi(int arg) {
        logger.log("вывоза метода multi с параметром = " + arg);
        return decorated.multi(arg);
    }

    @Override
    public int getResult() {
        logger.log("резельтирующий LOG ");
        return decorated.getResult();
    }
}
