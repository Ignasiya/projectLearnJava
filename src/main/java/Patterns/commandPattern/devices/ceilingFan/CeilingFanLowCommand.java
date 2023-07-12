package Patterns.commandPattern.devices.ceilingFan;

import Patterns.commandPattern.devices.Command;

public class CeilingFanLowCommand extends Command {
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanLowCommand(String nameCommand, CeilingFan ceilingFan) {
        super(nameCommand);
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.low();
    }

    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH) ceilingFan.high();
        else if (prevSpeed == CeilingFan.MEDIUM) ceilingFan.medium();
        else if (prevSpeed == CeilingFan.LOW) ceilingFan.low();
        else if (prevSpeed == CeilingFan.OFF) ceilingFan.off();
    }
}
