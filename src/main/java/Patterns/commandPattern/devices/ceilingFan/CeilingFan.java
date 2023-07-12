package Patterns.commandPattern.devices.ceilingFan;

public class CeilingFan {
    private String location;
    private int speed;
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    void high() {
        speed = HIGH;
        System.out.println(location + " высокая скорость вентилятора");
    }

    void medium() {
        speed = MEDIUM;
        System.out.println(location + " средняя скорость вентилятора");
    }
    void low() {
        speed = LOW;
        System.out.println(location + " низкая скорость вентилятора");
    }

    void off() {
        speed = OFF;
        System.out.println(location + " вентилятор выключен");
    }

    int getSpeed() {
        return speed;
    }
}
