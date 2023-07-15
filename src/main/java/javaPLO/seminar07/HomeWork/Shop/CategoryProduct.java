package javaPLO.seminar07.HomeWork.Shop;

import java.util.LinkedList;

public class CategoryProduct extends Shop {

    public CategoryProduct(String name) {
        super(name);
        super.setCatalog(new LinkedList<>());
    }

    @Override
    public String toString() {
        return "\n" + getName() + ": " + super.getCatalog();
    }
}
