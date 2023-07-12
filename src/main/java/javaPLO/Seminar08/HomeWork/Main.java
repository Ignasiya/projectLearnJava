package javaPLO.Seminar08.HomeWork;

import javaPLO.Seminar08.HomeWork.Obstacles.Obstacles;
import javaPLO.Seminar08.HomeWork.Obstacles.Treadmill;
import javaPLO.Seminar08.HomeWork.Obstacles.Wall;
import javaPLO.Seminar08.HomeWork.Participants.Cat;
import javaPLO.Seminar08.HomeWork.Participants.Human;
import javaPLO.Seminar08.HomeWork.Participants.Robot;

public class Main {
    public static void main(String[] args) {
        Object[] participants = {
                new Human("Женя", 50, 600),
                new Robot("Робокоп", 40, 540),
                new Human("Петр", 30, 500),
                new Cat("Тёмка", 30, 500),
                new Cat("Барсик", 20, 400),
                new Human("Гриша", 10, 300),
                new Robot("Подделка")
        };
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
        for (Object participant : participants) {
            for (Obstacles obstacle : obstacles) {
                System.out.print(obstacle.getName() + " - ");
                if (participant instanceof Human) {
                    if (obstacle instanceof Treadmill) {
                        if (!((Human) participant).run((Treadmill) obstacle)) break;
                    } else {
                        if (!((Human) participant).jump((Wall) obstacle)) break;
                    }
                } else if (participant instanceof Cat) {
                    if (obstacle instanceof Treadmill) {
                        if (!((Cat) participant).run((Treadmill) obstacle)) break;
                    } else {
                        if (!((Cat) participant).jump((Wall) obstacle)) break;
                    }
                }else if (participant instanceof Robot) {
                    if (obstacle instanceof Treadmill) {
                        if (!((Robot) participant).run((Treadmill) obstacle)) break;
                    } else {
                        if (!((Robot) participant).jump((Wall) obstacle)) break;
                    }
                }
            }
            System.out.println("Участник закончил соревнование \n");
        }
    }
}
