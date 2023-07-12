package Patterns.commandPattern.devices.stereo;

public class Stereo {
    private String name;

    private int volume;

    public Stereo(String name) {
        this.name = name;
    }

    void on() {
        System.out.println(name + " стерео включен");
    }

    void off() {
        System.out.println(name + " стерео выключен");
    }

    void setCd() {
        System.out.println(name + " выбран CD");
    }

    void setDvd() {
        System.out.println(name + " выбран DVD");
    }

    void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Выбрана громкость " + volume);
    }
}
