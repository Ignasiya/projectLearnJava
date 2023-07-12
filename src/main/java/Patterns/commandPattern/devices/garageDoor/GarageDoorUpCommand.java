package Patterns.commandPattern.devices.garageDoor;

import Patterns.commandPattern.devices.Command;

public class GarageDoorUpCommand extends Command {
    GarageDoor garageDoor;

    public GarageDoorUpCommand(String nameCommand, GarageDoor garageDoor) {
        super(nameCommand);
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
