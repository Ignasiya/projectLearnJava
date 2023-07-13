package patterns.facadePattern.data;

public class Amplifier {
    public void on(){
        System.out.println("Включаем усилитель");
    }

    public void off(){
        System.out.println("Выключаем усилитель");
    }

    public void Volume(int volume) {
        System.out.println("Звук " + volume);
    }

    public void setSurroundSound() {
        System.out.println("Выбран surround sound");
    }
}
