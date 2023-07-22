package javaPLO.seminar12.homeWork.model;

import javaPLO.seminar12.homeWork.data.Product;
import javaPLO.seminar12.homeWork.data.Warehouse;

import java.util.Scanner;

public class Delete extends Model {
    public Delete(String nameMenu) {
        super(nameMenu);
    }

    @Override
    public void execute(Warehouse warehouse, Scanner scanner) {
        System.out.println("Введите id продукта: ");
        int key = scanner.nextInt();
        for (Product product : warehouse.getProducts()) {
            if (product.getId() == key) {
                System.out.println(product);
                System.out.print("удалить? Y/N ");
                String in = scanner.next().toUpperCase();
                if (in.equals("Y")) warehouse.delete(product);
            }
        }
    }
}
