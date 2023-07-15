package javaPLO.seminar07.Ex02;

public class Main {
    public static void main(String[] args) {
        CreditAccount credit = new CreditAccount("Иван Иванов", 123456, 1000.00, 10.0);
        SafeAccount safe = new SafeAccount("Иван Иванов", 321654, 3000.00, 10.0);
        System.out.println(credit.getBalance());
        credit.calculateInterest();
        System.out.println(credit.getBalance());
        System.out.println(safe.getBalance());
        safe.addInterest();
        System.out.println(safe.getBalance());
    }
}
