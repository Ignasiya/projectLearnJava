package JavaPLO.Seminar11.Ex03.controller;

import JavaPLO.Seminar11.Ex03.data.Student;
import JavaPLO.Seminar11.Ex03.service.UserService;

import java.util.List;

public class Controller {

    public void send(List<Student> students) {
        UserService userService = new UserService();
        userService.create(students);
    }

    public List<Student> show() {
        UserService userService = new UserService();
        return userService.read();
    }
}
