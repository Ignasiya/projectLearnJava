package JavaPLO.Seminar11.Ex03.service;

import JavaPLO.Seminar11.Ex03.data.Student;

import java.util.List;

public class UserService implements DataService {
    List<Student> studentList;
    @Override
    public void create(List<Student> students) {
        this.studentList.addAll(students);
    }

    @Override
    public List<Student> read() {
        return studentList;
    }
}
