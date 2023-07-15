package javaPLO.seminar10.Ex04;

import java.util.ArrayList;
import java.util.List;

/*4)Написать Generic-class LRUCache, с методами : addElement, getElement(по позиции), getAllElement.
Посмотреть как поведет себя с классом Employee(fio,salary,jobTitle)
 Логика кэша такая:
в конструктор при создании подается количество кэшируемых элементов
При переполнении крайний левый элемент кэша(самый старый) удаляется
В самый правый конец добавляется новый элемент*/
public class Main {
    public static void main(String[] args) {
        LRUCache<Employee> lru = new LRUCache<Employee>(4);
        List<Employee> employees = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            employees.add(new Employee("Иван " + i, i * 100, "раб " + i));
        }
        for (Employee employee : employees) {
            lru.addElement(employee);
            System.out.println(lru.getAllElements());
        }
    }
}
