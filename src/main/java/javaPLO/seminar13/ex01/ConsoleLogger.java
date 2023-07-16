package javaPLO.seminar13.ex01;

public class ConsoleLogger implements Loggable {
    @Override
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
