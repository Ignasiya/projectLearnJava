package JavaPLO.Seminar08.Ex03;

public class Car implements Transport{

    @Override
    public void start() {
        System.out.println(" машина поехала!");
    }

    public void stop() {
        System.out.println(" машина остановилась!");
    }
}
