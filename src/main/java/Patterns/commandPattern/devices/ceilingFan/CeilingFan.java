package Patterns.commandPattern.devices.ceilingFan;

public class CeilingFan {
    private String name;

    public CeilingFan(String name) {
        this.name = name;
    }

    void high() {
        System.out.println(name + " выбрана высокая скорость потолочного вентилятора");
    }

    void off() {
        System.out.println(name + " потолочный вентилятор выключен");
    }
}
