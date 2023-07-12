package javaPLO.Seminar08.Ex03;

public class Bicycle implements Transport{

    @Override
    public void start() {
        System.out.println(" велосипед поехала!");
    }

    public void stop() {
        System.out.println(" велосипед остановилась!");
    }
}
