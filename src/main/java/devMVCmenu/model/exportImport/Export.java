package devMVCmenu.model.exportImport;

import devMVCmenu.model.Menu;

public class Export extends Menu {
    public Export(String nameMenu) {
        super(nameMenu);
    }

    @Override
    public void execute() {
        System.out.println("TODO метод экспорта");
    }
}
