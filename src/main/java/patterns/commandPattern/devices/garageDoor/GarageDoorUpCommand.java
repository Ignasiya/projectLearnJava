package patterns.commandPattern.devices.garageDoor;

import patterns.commandPattern.devices.Command;

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

    @Override
    public void undo() {
        garageDoor.down();
    }
}
