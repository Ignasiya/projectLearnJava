package patterns.templatePattern.CaffeineBeverage;

public abstract class CaffeineBeverage {
    public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    private void boilWater() {
        System.out.println("Вскипятить воду");
    }

    private void pourInCup() {
        System.out.println("Перелить в чашку");
    }

    public boolean customerWantsCondiments() {
        return true;
    }
}
