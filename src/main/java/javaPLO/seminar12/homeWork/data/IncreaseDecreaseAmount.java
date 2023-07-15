package javaPLO.seminar12.homeWork.data;

import javaPLO.seminar12.homeWork.data.Product;

public interface IncreaseDecreaseAmount {

    /**
     * Interface segregation principle декомпозирован по функциональным интерфейсам
     */
    public Product increase(Product product, int amount);
    public Product decrease(Product product, int amount);
}
