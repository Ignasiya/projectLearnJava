package javaPLO.seminar11.Ex03.view;

import javaPLO.seminar11.Ex03.controller.Controller;
import javaPLO.seminar11.Ex03.data.Student;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class StudentView {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            students.add(new Student("Иван" + i, LocalDate.now(), i));
        }
        Controller controller = new Controller();
        controller.send(students);
        controller.show();
    }
}
