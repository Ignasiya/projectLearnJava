package JavaPLO.Seminar08.HomeWork;

import JavaPLO.Seminar08.HomeWork.Obstacles.Obstacles;
import JavaPLO.Seminar08.HomeWork.Obstacles.Treadmill;
import JavaPLO.Seminar08.HomeWork.Obstacles.Wall;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // todo участники
        Obstacles[] obstacles = {
                new Treadmill("Дорожка 1", 120),
                new Wall("Стена 1", 10),
                new Treadmill("Дорожка 2", 130),
                new Wall("Стена 2", 20),
                new Treadmill("Дорожка 3", 140),
                new Wall("Стена 3", 30),
                new Treadmill("Дорожка 4", 150),
                new Wall("Стена 4", 40),
        };
        for (Obstacles obstacle : obstacles) {
            // todo вложенный цикл участники
        }
    }
}
