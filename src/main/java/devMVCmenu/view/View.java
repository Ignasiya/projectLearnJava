package devMVCmenu.view;

import devMVCmenu.control.Control;
import devMVCmenu.model.*;
import devMVCmenu.model.exportImport.SubMenu;

import java.util.Scanner;

public class View {
    private final Control control;

    public View(Control control) {
        this.control = control;
        start(control);
    }

    public View() {
        this.control = new Control(
                new Show("Просмотр"),
                new Add("Добавить"),
                new Delete("Удалить"),
                new SubMenu("Импорт\\Экспорт"),
                new Exit("Выход")
        );
        start(control);
    }

    private void start(Control control) {
        Scanner in = new Scanner(System.in);
        System.out.print(control.toString() + "\n");
        while (true) {
            System.out.print(" ->");
            control.onExecute(in.nextInt() - 1);
        }
    }
}

