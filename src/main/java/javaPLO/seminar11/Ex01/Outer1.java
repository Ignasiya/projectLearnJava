package javaPLO.seminar11.Ex01;

public class Outer1 {
    public Outer1(int outerValue) {
        this.outerValue = outerValue;
    }

    public Outer1() {
    }

    /**
     * внутренний класс начало
     */
    class Inner {
        int innerValue;

        public Inner(int innerValue) {
            this.innerValue = innerValue;
        }

        public void innerMethod() {
            System.out.println(innerValue);
            System.out.println(outerValue);
            outerMethod();
            // innerMethod(); робит
        }
    }

    // todo конец внутреннего класса
    int outerValue;

    public void outerMethod() {
        // System.out.println(innerValue); не робит
        System.out.println(outerValue);
        outerMethod();
        // innerMethod(); не робит
    }

    public static void main(String[] args) {
        Inner inner = new Outer1().new Inner(3);
    }
}
