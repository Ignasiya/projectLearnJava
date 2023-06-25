package JavaPLO.Seminar07.HomeWork.Shop;

import java.util.LinkedList;
import java.util.List;

public class CategoryProduct extends Shop {

    public CategoryProduct(String name, List<Product> product) {
        super(name);
        super.setCatalog(product);
    }

    public CategoryProduct(List<Product> product) {
        super.setCatalog(product);
    }

    public CategoryProduct(String name) {
        super(name);
        super.setCatalog(new LinkedList<>());
    }

    @Override
    public String toString() {
        return "\n" + getName() + ": " + super.getCatalog();
    }
}
