package javaPLO.seminar12.homeWork.model.change;

import javaPLO.seminar12.homeWork.data.warehouse.Warehouse;
import javaPLO.seminar12.homeWork.view.View;

import java.util.Scanner;

public class Return extends Change {

    public Return(String nameMenu, View view) {
        super(nameMenu, view);
    }

    @Override
    public void execute(Warehouse warehouse, Scanner scanner) {
        view.start(view.getControl());
    }
}
