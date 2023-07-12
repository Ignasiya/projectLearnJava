package Patterns.commandPattern.devices;

public abstract class Command {
    protected String nameCommand;

    public Command(String nameCommand) {
        this.nameCommand = nameCommand;
    }

    public Command() {}

    public abstract void execute();

    public String getNameCommand() {
        return nameCommand;
    }
}
