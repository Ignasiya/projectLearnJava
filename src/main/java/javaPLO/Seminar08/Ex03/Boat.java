package javaPLO.Seminar08.Ex03;

public class Boat implements Transport{

    @Override
    public void start() {
        System.out.println(" катер поехал!");
    }

    public void stop() {
        System.out.println(" катер остановился!");
    }
}
