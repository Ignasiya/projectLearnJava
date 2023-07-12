package Patterns.commandPattern.devices;

public class NoCommand extends Command{

    public NoCommand() {
        nameCommand = "Нет команды";
    }

    @Override
    public void execute() {
        System.out.println("Нет комманды");
    }

    @Override
    public void undo() {
        System.out.println("Нет комманды");
    }
}
