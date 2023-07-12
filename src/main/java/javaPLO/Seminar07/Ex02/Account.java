package javaPLO.Seminar07.Ex02;

public class Account {
    private String owner;
    private Integer number;
    private Double balance;

    public Account() {
    }

    public Account(String owner, Integer number, Double balance) {
        this.owner = owner;
        this.number = number;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) this.balance -= amount;
        else System.out.println("Недостаточно кэша\n Остаток на счете: " + balance);
    }

    @Override
    public String toString() {
        return "Account{" +
                "owner='" + owner + '\'' +
                ", number=" + number +
                ", balance=" + balance +
                '}';
    }
}
