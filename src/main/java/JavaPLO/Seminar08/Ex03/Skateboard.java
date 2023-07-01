package JavaPLO.Seminar08.Ex03;

public class Skateboard implements Transport{
    @Override
    public void start() {
        System.out.println(" скейтборд поехала!");
    }

    public void stop() {
        System.out.println(" скейтборд остановилась!");
    }
}
