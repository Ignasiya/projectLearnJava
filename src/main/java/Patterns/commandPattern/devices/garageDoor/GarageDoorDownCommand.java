package Patterns.commandPattern.devices.garageDoor;

import Patterns.commandPattern.devices.Command;

public class GarageDoorDownCommand extends Command {
    GarageDoor garageDoor;

    public GarageDoorDownCommand(String nameCommand, GarageDoor garageDoor) {
        super(nameCommand);
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.up();
    }
}
