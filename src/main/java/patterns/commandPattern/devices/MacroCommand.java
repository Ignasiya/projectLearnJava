package patterns.commandPattern.devices;

public class MacroCommand extends Command{
    Command[] commands;

    public MacroCommand(String nameCommand, Command[] commands) {
        super(nameCommand);
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
        }
    }

    @Override
    public void undo() {
        for (int i = 0; i < commands.length; i--) {
            commands[i].undo();
        }
    }
}
