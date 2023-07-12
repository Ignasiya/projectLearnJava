package patterns.commandPattern.devices.ceilingFan;

import patterns.commandPattern.devices.Command;

public class CeilingFanOffCommand extends Command {
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanOffCommand(String name, CeilingFan ceilingFan) {
        super(name);
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
    }

    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH) ceilingFan.high();
        else if (prevSpeed == CeilingFan.MEDIUM) ceilingFan.medium();
        else if (prevSpeed == CeilingFan.LOW) ceilingFan.low();
        else if (prevSpeed == CeilingFan.OFF) ceilingFan.off();
    }
}
