package patterns.commandPattern.devices.ceilingFan;

import patterns.commandPattern.devices.Command;

public class CeilingFanMediumCommand extends Command {
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanMediumCommand(String nameCommand, CeilingFan ceilingFan) {
        super(nameCommand);
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
    }

    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH) ceilingFan.high();
        else if (prevSpeed == CeilingFan.MEDIUM) ceilingFan.medium();
        else if (prevSpeed == CeilingFan.LOW) ceilingFan.low();
        else if (prevSpeed == CeilingFan.OFF) ceilingFan.off();
    }
}
