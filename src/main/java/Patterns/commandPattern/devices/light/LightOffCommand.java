package Patterns.commandPattern.devices.light;

import Patterns.commandPattern.devices.Command;

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
}
