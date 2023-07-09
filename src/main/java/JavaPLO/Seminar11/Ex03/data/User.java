package JavaPLO.Seminar11.Ex03.data;

import java.time.LocalDate;

public abstract class User {
    String name;
    LocalDate dateBirth;

    public User(String name, LocalDate dateBirth) {
        this.name = name;
        this.dateBirth = dateBirth;
    }

    public User() {
    }
}
