package devMVCmenu.model;

import devMVCmenu.view.View;

public class Return extends Menu {
    public Return(String nameMenu) {
        super(nameMenu);
    }

    @Override
    public void execute() {
        new View();
    }
}
