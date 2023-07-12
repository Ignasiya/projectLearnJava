package patterns.commandPattern.devices.light;

import patterns.commandPattern.devices.Command;

public class LightOffCommand extends Command {
    Light light;

    public LightOffCommand(String nameCommand, Light light) {
        super(nameCommand);
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
