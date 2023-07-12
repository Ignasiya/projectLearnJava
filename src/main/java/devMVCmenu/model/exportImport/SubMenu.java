package devMVCmenu.model.exportImport;

import devMVCmenu.control.Control;
import devMVCmenu.model.Menu;
import devMVCmenu.model.Return;
import devMVCmenu.view.View;

public class SubMenu extends Menu {

    public SubMenu(String nameMenu) {
        super(nameMenu);
    }

    @Override
    public void execute() {
        Control sub = new Control(
                new Export("Экспорт"),
                new Import("Импорт"),
                new Return("Назад"));
        new View(sub);
    }
}
