package devMVCmenu.model;

public class Exit extends Menu {
    public Exit(String nameMenu) {
        super(nameMenu);
    }

    @Override
    public void execute() {
        System.out.println("выход...");
        System.exit(0);
    }
}
