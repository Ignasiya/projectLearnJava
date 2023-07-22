package exceptions.lesson02;

public class Ex01 {
    public static void main(String[] args) {
        int number = 1;
        try {
            number = 10 / 0;
            String test = null;
            System.out.println(test.length());
        } catch (ArithmeticException e) {
            System.out.println("на ноль делить нельзя");
        } catch (NullPointerException e) {
            System.out.println("nullpointer");
        } catch (Exception e) {
            System.out.println("exception");
        }
        System.out.println(number);
    }
}
