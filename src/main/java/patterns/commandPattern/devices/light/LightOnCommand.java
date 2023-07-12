package patterns.commandPattern.devices.light;

import patterns.commandPattern.devices.Command;

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

    @Override
    public void undo() {
        light.off();
    }
}
