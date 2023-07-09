package JavaPLO.Seminar11.Ex03.data;

import java.time.LocalDate;

public class Teacher extends User {
    int teacherID;

    public Teacher(String name, LocalDate dateBirth, int teacherID) {
        super(name, dateBirth);
        this.teacherID = teacherID;
    }

    public Teacher(int teacherID) {
        this.teacherID = teacherID;
    }
}
