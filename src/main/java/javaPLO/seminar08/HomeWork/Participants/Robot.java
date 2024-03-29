package javaPLO.seminar08.HomeWork.Participants;

import javaPLO.seminar08.HomeWork.Interface.Jump;
import javaPLO.seminar08.HomeWork.Interface.Run;
import javaPLO.seminar08.HomeWork.Obstacles.Treadmill;
import javaPLO.seminar08.HomeWork.Obstacles.Wall;

public class Robot implements Run, Jump {
    private final String name;
    private final int heightJump;
    private int runDistance;

    public Robot(String name, int heightJump, int runDistance) {
        this.name = name;
        this.heightJump = heightJump;
        this.runDistance = runDistance;
    }

    public Robot(String name) {
        this.name = name;
        this.heightJump = 0;
        this.runDistance = 0;
    }

    @Override
    public boolean jump(Wall wall) {
        if (heightJump >= wall.getHeight()) {
            System.out.println(getName() + " перелетел");
            return true;
        } else {
            System.out.println(getName() + " выбыл из соревнования");
            return false;
        }
    }

    @Override
    public boolean run(Treadmill treadmill) {
        if (runDistance >= treadmill.getDistance()) {
            runDistance -= treadmill.getDistance();
            System.out.println(getName() + " проехал");
            return true;
        } else {
            System.out.println(getName() + " выбыл из соревнования");
            return false;
        }
    }

    public String getName() {
        return name;
    }
}
