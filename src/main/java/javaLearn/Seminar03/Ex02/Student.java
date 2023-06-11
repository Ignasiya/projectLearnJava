package javaLearn.Seminar03.Ex02;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Student {
    private String secondName;
    private int groupNumber;
    private int salary;
    private List<Integer> scores;
}
