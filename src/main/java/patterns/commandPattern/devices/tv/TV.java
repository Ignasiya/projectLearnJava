package patterns.commandPattern.devices.tv;

public class TV {

    void on() {
        System.out.println("Телевизор включен");
    }

    void off() {
        System.out.println("Телевизор выключен");
    }

    void setInputChannel() {
        System.out.println("Выбран канал");
    }

    void setVolume() {
        System.out.println("Выбрана громкость");
    }
}
