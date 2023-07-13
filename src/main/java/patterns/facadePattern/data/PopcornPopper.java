package patterns.facadePattern.data;

public class PopcornPopper {
    public void on(){
        System.out.println("Включаем попкорн");
    }

    public void off(){
        System.out.println("Выключаем попкорн");
    }

    public void pop() {
        System.out.println("Готовим попкорн");
    }
}
