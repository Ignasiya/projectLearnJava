package javaPLO.seminar11.Ex03.data;

import java.time.LocalDate;

public class Student extends User {
    int studentID;

    public Student(String name, LocalDate dateBirth, int studentID) {
        super(name, dateBirth);
        this.studentID = studentID;
    }

    public Student(int studentID) {
        this.studentID = studentID;
    }
}
