package javaLearn.Seminar03.HomeWork.HW02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Высший макарон", "Франция", 100, 120, 1);
        Product product2 = new Product("Турецкий костюм", "Турция", 200, 10000, 2);
        Product product3 = new Product("Матрас памяти", "Россия", 12000, 20000, 1);
        Product product4 = new Product("Хлеб высший", "Франция", 70, 130, 1);
        Product product5 = new Product("Пряники заречные", "Россия", 150, 50, 3);
        Product product6 = new Product("Аква-смартфон", "Китай", 700, 10000, 2);
        Product product7 = new Product("Гречка высшего качества", "Россия", 200, 120, 1);
        Product product8 = new Product("Высшего качества шаурма", "Грузия", 130, 5000, 3);
        Product product9 = new Product("Батут", "Китай", 40000, 60000, 1);
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
        List<String> result = productGetGradeMinPrice(products);
        for (String s : result) {
            System.out.print(s + "; ");
        }
    }

    /**
     * @param products список товаров
     * @return список имен товаров
     * @apiNote получить наименования товаров заданного сорта с наименьшей ценой
     */
    private static List<String> productGetGradeMinPrice(List<Product> products) {
        int grade = getGrade();
        List<String> result = new ArrayList<>();
        int min = findMaxPrice(products);
        for (Product product : products) {
            if (product.getGrade() == grade && min > product.getPrice()) min = product.getPrice();
        }
        for (Product product : products) {
            if (product.getPrice() == min) result.add(product.getNameProduct());
        }
        return result;
    }

    /**
     * @param products список товаров
     * @return максимальная цена
     * @apiNote нахождение максимальной цены среди товаров
     */
    private static int findMaxPrice(List<Product> products) {
        int max = 0;
        for (Product product : products) {
            if (max < product.getPrice()) max = product.getPrice();
        }
        return max;
    }

    /**
     * @return заданный пользователем сорт товара
     * @apiNote пока не будет правильное значение
     */
    private static int getGrade() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сорт товара(1, 2, 3):");
        while (true) {
            int grade = scanner.nextInt();
            switch (grade) {
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                default: {
                    System.out.println("Введен некорректный сорт");
                    break;
                }
            }
        }
    }
}
