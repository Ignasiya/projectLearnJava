package javaPLO.seminar12.homeWork.view;

import javaPLO.seminar12.homeWork.control.*;
import javaPLO.seminar12.homeWork.data.warehouse.MoscowWarehouse;
import javaPLO.seminar12.homeWork.data.warehouse.Warehouse;
import javaPLO.seminar12.homeWork.model.*;
import javaPLO.seminar12.homeWork.model.change.Change;

import java.util.Scanner;

public class V1View implements View {
    protected Control control;
    public V1View(Control control) {
        this.control = control;
        start(control);
    }

    public V1View() {
        Warehouse warehouse = new MoscowWarehouse();
        this.control = new V1Control(warehouse,
                new Show("Просмотр"),
                new Add("Добавить"),
                new Delete("Удалить"),
                new Change("Изменить", this),
                new Order("Заказ"),
                new Exit("Выход")
        );
        start(control);
    }
    @Override
    public void start(Control control) {
        Scanner in = new Scanner(System.in).useDelimiter("\r?\n");
        System.out.print(control.toString() + "\n");
        while (true) {
            System.out.print(" меню->");
            int key = in.nextInt() - 1;
            if (key >= 0 && key < control.size()) control.onExecute(key, in);
            else System.out.println("неверное значение...");
        }
    }

    @Override
    public Control getControl() {
        return control;
    }
}

