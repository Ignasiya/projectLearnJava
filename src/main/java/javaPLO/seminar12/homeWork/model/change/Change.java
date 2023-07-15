package javaPLO.seminar12.homeWork.model.change;

import javaPLO.seminar12.homeWork.control.*;
import javaPLO.seminar12.homeWork.data.warehouse.Warehouse;
import javaPLO.seminar12.homeWork.model.Model;
import javaPLO.seminar12.homeWork.view.*;

import java.util.Scanner;

public class Change extends Model {
    protected final View view;
    public Change(String nameMenu, View view) {
        super(nameMenu);
        this.view = view;
    }

    @Override
    public void execute(Warehouse warehouse, Scanner scanner) {
        Control sub = new V1Control(warehouse,
                new Increase("Увеличение количества"),
                new Decrease("Уменьшение количества"),
                new Return("Назад", view));
        new V1View(sub);
    }
}
