package Patterns.commandPattern.devices.ceilingFan;

import Patterns.commandPattern.devices.Command;

public class CeilingFanOnCommand extends Command {
    CeilingFan ceilingFan;

    public CeilingFanOnCommand(String nameCommand, CeilingFan ceilingFan) {
        super(nameCommand);
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.high();
    }
}
