package patterns.facadePattern.data;

public class Streaming {
    public void on(){
        System.out.println("Включаем стриминг");
    }

    public void off(){
        System.out.println("Выключаем стриминг");
    }

    public void play(String movie){
        System.out.println("Смотрим кино " + movie);
    }

    public void stop(){
        System.out.println("Стоп");
    }
}
