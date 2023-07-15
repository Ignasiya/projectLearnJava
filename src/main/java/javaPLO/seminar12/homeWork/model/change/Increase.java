package javaPLO.seminar12.homeWork.model.change;

import javaPLO.seminar12.homeWork.data.Product;
import javaPLO.seminar12.homeWork.data.warehouse.Warehouse;
import javaPLO.seminar12.homeWork.model.Model;

import java.util.Scanner;

public class Increase extends Model {
    public Increase(String nameMenu) {
        super(nameMenu);
    }

    @Override
    public void execute(Warehouse warehouse, Scanner scanner) {
        System.out.println("Введите id продукта: ");
        int key = scanner.nextInt();
        for (Product product : warehouse.getProducts()) {
            if (product.getId() == key) {
                System.out.println(product);
                System.out.print("количество +");
                warehouse.increase(product, scanner.nextInt());
                System.out.print("успешно");
            }
        }
    }
}
