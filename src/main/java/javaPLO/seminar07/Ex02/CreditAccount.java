package javaPLO.seminar07.Ex02;

public class CreditAccount extends Account{
    private double degreePercent;

    public CreditAccount(String owner, Integer number, Double balance, double degreePercent) {
        super(owner, number, balance);
        this.degreePercent = degreePercent;
    }

    public double getDegreePercent() {
        return degreePercent;
    }

    public void setDegreePercent(double degreePercent) {
        this.degreePercent = degreePercent;
    }

    public void calculateInterest(){
        withdraw(getBalance() * degreePercent / 100);
    }

    @Override
    public String toString() {
        return "CreditAccount{" +
                "degreePercent=" + degreePercent +
                ", owner='" + getOwner() + '\'' +
                ", number=" + getNumber() +
                ", balance=" + getBalance() +
                '}';
    }
}
