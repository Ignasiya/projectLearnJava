package devMVCmenu.model;

public abstract class Menu {
    protected String nameMenu;

    public Menu(String nameMenu) {
        this.nameMenu = nameMenu;
    }

    public abstract void execute();

    public String getNameMenu() {
        return nameMenu;
    }

    @Override
    public String toString() {
        return nameMenu;
    }
}
