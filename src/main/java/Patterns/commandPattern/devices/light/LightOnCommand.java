package Patterns.commandPattern.devices.light;

import Patterns.commandPattern.devices.Command;

public class LightOnCommand extends Command {
    Light light;

    public LightOnCommand(String nameCommand, Light light) {
        super(nameCommand);
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
