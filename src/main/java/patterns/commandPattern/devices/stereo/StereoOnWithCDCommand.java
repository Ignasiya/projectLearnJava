package patterns.commandPattern.devices.stereo;

import patterns.commandPattern.devices.Command;

public class StereoOnWithCDCommand extends Command {
    Stereo stereo;

    public StereoOnWithCDCommand(String nameCommand, Stereo stereo) {
        super(nameCommand);
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
