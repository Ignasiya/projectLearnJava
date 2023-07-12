package patterns.commandPattern.devices;

public abstract class Command {
    protected String nameCommand;

    public Command(String nameCommand) {
        this.nameCommand = nameCommand;
    }

    public Command() {}

    public abstract void execute();
    public abstract void undo();

    public String getNameCommand() {
        return nameCommand;
    }
}
