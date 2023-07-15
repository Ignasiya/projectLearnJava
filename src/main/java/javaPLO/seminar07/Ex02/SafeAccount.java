package javaPLO.seminar07.Ex02;

public class SafeAccount extends Account{

    private double percent;

    public SafeAccount(String owner, Integer number, Double balance, double percent) {
        super(owner, number, balance);
        this.percent = percent;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public void addInterest() {
        deposit(getBalance() * percent / 100);
    }

    @Override
    public String toString() {
        return "SafeAccount{" +
                "percent=" + percent +
                ", owner='" + getOwner() + '\'' +
                ", number=" + getNumber() +
                ", balance=" + getBalance() +
                '}';
    }
}
