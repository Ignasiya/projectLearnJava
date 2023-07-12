package Patterns.commandPattern.devices.garageDoor;

public class GarageDoor {
    private String name;

    public GarageDoor(String name) {
        this.name = name;
    }

    void up() {
        System.out.println(name + " ворота гаража подняты");
    }

    void down() {
        System.out.println(name + " ворота гаража опущены");
    }

    void stop() {
        System.out.println(name + " ворота гаража остановлены");
    }

    void lightOn() {
        System.out.println(name + " свет гаража включен");
    }

    void lightOff() {
        System.out.println(name + " свет гаража выключен");
    }
}
