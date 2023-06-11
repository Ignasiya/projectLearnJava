package javaLearn.Seminar03.HomeWork.HW01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Высший макарон", 1000, 1);
        Product product2 = new Product("Турецкий костюм", 10000, 2);
        Product product3 = new Product("Матрас памяти", 20000, 1);
        Product product4 = new Product("Хлеб высший", 100, 2);
        Product product5 = new Product("Пряники заречные", 50, 3);
        Product product6 = new Product("Аква-смартфон", 10000, 1);
        Product product7 = new Product("Гречка высшего качества", 120, 1);
        Product product8 = new Product("Высшего качества шаурма", 5000, 3);
        Product product9 = new Product("Батут", 60000, 1);
        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);
        products.add(product8);
        products.add(product9);
        System.out.println("maxPriceProduct(products) = " + maxPriceProduct(products));
    }

    /**
     * @param products передоваемый список товаров
     * @return Наибольшая цена товара
     * @apiNote Найти наибольшую цену товаров 1го или 2-го сорта среди товаров, название которых содержит «высший»
     */
    private static int maxPriceProduct(List<Product> products) {
        int max = 0;
        for (Product product : products) {
            if ((product.getGrade() == 1 || product.getGrade() == 2)
                    && product.getNameProduct().toLowerCase().contains("высш")) {
                if (max < product.getPrice()) max = product.getPrice();
            }
        }
        return max;
    }
}
