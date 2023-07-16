package javaPLO.seminar13.ex02;

import java.util.Random;

// Это компания, которая нуждается в сотрудниках, она будет давать команду агенству
public class Company {
    Publisher jobAgency;
    String nameCompany;
    Random rnd;
    int maxSalary;

    // компания работает с определенным агенством
    public Company(Publisher jobAgency, String nameCompany, int maxSalary){
        this.jobAgency = jobAgency;
        this.nameCompany = nameCompany;
        rnd = new Random();
        this.maxSalary = maxSalary;
    }

    public void needEmployee(){
        int salary = rnd.nextInt(maxSalary);
        jobAgency.sendOffer(nameCompany, salary);
    }
}
