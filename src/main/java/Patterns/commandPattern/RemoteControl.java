package Patterns.commandPattern;

import Patterns.commandPattern.devices.Command;
import Patterns.commandPattern.devices.NoCommand;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        offCommands[slot] = offCommand;
        onCommands[slot] = onCommand;
    }

    public void onButton(int slot) {
        onCommands[slot].execute();
    }

    public void offButton(int slot) {
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuilder menu = new StringBuilder();
        menu.append("\n------ Remote Control ------\n");
        for (int i = 0; i < onCommands.length; i++) {
            menu.append("[slot ")
                    .append(i)
                    .append("] ")
                    .append(onCommands[i].getNameCommand())
                    .append("       ")
                    .append(offCommands[i].getNameCommand())
                    .append("\n");
        }
        return menu.toString();
    }
}
