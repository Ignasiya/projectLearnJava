package Patterns.commandPattern;

import Patterns.commandPattern.devices.Command;
import Patterns.commandPattern.devices.NoCommand;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        offCommands[slot] = offCommand;
        onCommands[slot] = onCommand;
    }

    public void onButton(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButton(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButton() {
        undoCommand.undo();
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
