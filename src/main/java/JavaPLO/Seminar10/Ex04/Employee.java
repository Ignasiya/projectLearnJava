package JavaPLO.Seminar10.Ex04;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    String fio;
    double salary;
    String jobTitle;
}
