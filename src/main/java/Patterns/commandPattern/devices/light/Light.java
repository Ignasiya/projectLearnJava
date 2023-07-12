package Patterns.commandPattern.devices.light;

public class Light {
    private String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " свет включен");
    }

    void off() {
        System.out.println(name + " свет выключен");
    }
}
