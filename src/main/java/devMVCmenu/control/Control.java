package devMVCmenu.control;

import devMVCmenu.model.Menu;

public class Control {
    private final Menu[] menu;

    public Control(Menu... menu) {
        this.menu = menu;
    }

    public void onExecute(int item) {
        menu[item].execute();
    }

    @Override
    public String toString() {
        StringBuilder main = new StringBuilder();
        main.append("\n----------MENU----------\n")
                .append("Enter a menu item:\n");
        for (int i = 0; i < menu.length; i++) {
            main.append("[")
                    .append(i + 1)
                    .append("] ")
                    .append(menu[i].getNameMenu())
                    .append("\n");
        }
        return main.toString();
    }
}
