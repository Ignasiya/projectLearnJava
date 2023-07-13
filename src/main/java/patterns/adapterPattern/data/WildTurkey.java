package patterns.adapterPattern.data;

public class WildTurkey implements Turkey {
    @Override
    public void fly() {
        System.out.println("Я летаю на маленькие дистанции");
    }

    @Override
    public void gobble() {
        System.out.println("Гобл гобл");
    }
}
