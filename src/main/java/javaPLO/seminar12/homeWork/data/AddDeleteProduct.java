package javaPLO.seminar12.homeWork.data;

import javaPLO.seminar12.homeWork.data.Product;

import java.util.List;

public interface AddDeleteProduct {

    /**
     * Interface segregation principle декомпозирован по функциональным интерфейсам
     */
    public List<Product> addProduct(Product product);
    public List<Product> delete(Product product);
}
