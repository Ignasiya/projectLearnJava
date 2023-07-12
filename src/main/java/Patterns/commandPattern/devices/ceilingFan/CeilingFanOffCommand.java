package Patterns.commandPattern.devices.ceilingFan;

import Patterns.commandPattern.devices.Command;

public class CeilingFanOffCommand extends Command {
    CeilingFan ceilingFan;

    public CeilingFanOffCommand(String name, CeilingFan ceilingFan) {
        super(name);
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.off();
    }
}
