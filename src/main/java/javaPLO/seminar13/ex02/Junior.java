package javaPLO.seminar13.ex02;

import java.util.Random;

public class Junior implements Observer {
    private String name;

    public Junior(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (new Random().nextBoolean()) {
            System.out.println(String.format("Student %s: I need this work! (company, salary) = %s, %d", name, nameCompany, salary));
        }
        else {
            System.out.println(String.format("Student %s: I got better job! (company, salary) = %s, %d", name, nameCompany, salary));
        }
    }
}
