package javaPLO.seminar11.Ex03.service;

import javaPLO.seminar11.Ex03.data.Student;

import java.util.List;

public interface DataService {
    void create(List<Student> studentList);
    List<Student> read();
}
