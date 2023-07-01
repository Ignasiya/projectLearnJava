package JavaPLO.Seminar08.HomeWork.Participants;

import JavaPLO.Seminar08.HomeWork.Interface.Jump;
import JavaPLO.Seminar08.HomeWork.Interface.Run;

public class Human implements Run, Jump {

    private final String name;
    private final int heightJump;
    private final int runDistance;

    public Human(String name, int heightJump, int runDistance) {
        this.name = name;
        this.heightJump = heightJump;
        this.runDistance = runDistance;
    }

    @Override
    public void jump() {

    }

    @Override
    public void run() {

    }

    public String getName() {
        return name;
    }

    public int getHeightJump() {
        return heightJump;
    }

    public int getRunDistance() {
        return runDistance;
    }
}
