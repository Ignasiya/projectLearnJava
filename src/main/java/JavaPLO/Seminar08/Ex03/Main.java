package JavaPLO.Seminar08.Ex03;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Car car = new Car();
        human.drive(car);
        human.drive(car);
        human.stop();
        Bicycle bicycle = new Bicycle();
        human.stop();
        human.stop();
        Boat boat = new Boat();
        human.drive(boat);
        human.stop();
    }
}
