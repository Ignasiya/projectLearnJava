package javaLearn.Seminar03.HomeWork.HW01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private String nameProduct;
    private Integer price;
    private Integer grade;
}
