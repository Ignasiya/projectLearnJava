package javaPLO.seminar07.Ex01;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("Животное: " + name + " - гав гав");
    }
}
