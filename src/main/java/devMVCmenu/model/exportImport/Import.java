package devMVCmenu.model.exportImport;

import devMVCmenu.model.Menu;

public class Import extends Menu {
    public Import(String nameMenu) {
        super(nameMenu);
    }

    @Override
    public void execute() {
        System.out.println("TODO метод импорта");
    }
}
