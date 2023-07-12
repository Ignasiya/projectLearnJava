package Patterns.commandPattern.devices.stereo;

import Patterns.commandPattern.devices.Command;

public class StereoOffCommand extends Command {
    Stereo stereo;

    public StereoOffCommand(String nameCommand, Stereo stereo) {
        super(nameCommand);
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
