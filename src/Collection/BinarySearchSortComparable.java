package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchSortComparable {
    public static void main(String[] args) {
        Employee2 emp1 = new Employee2 (100, "Aleksandr", 12345);
        Employee2 emp2 = new Employee2 (15, "Ivan", 6542);
        Employee2 emp3 = new Employee2 (123, "Petr", 8542);
        Employee2 emp4 = new Employee2 (15, "Mariya", 5678);
        Employee2 emp5 = new Employee2 (182, "Nikolay", 125);
        Employee2 emp6 = new Employee2 (15, "Sasha", 9874);
        Employee2 emp7 = new Employee2 (250, "Elena", 1579);
        List<Employee2> employee2List = new ArrayList<>();
        employee2List.add(emp1);
        employee2List.add(emp2);
        employee2List.add(emp3);
        employee2List.add(emp4);
        employee2List.add(emp5);
        employee2List.add(emp6);
        employee2List.add(emp7);
        System.out.println(employee2List);
//  \\Collections.sort//
//        Сортирует список примитивных данных,
//        а так же референсных если класс референсных данных implements Comparable<Имя Класса>
//        и перезаписан (@Override) compareTo
        Collections.sort(employee2List);
        System.out.println(employee2List);
//  \\Collections.binarySearch//
//        Ищем в отсортированном списке элемент удовлетворяющий всем данным в его элементе которые указаны в compareTo
        int index = Collections.binarySearch(employee2List, new Employee2(182, "Nikolay", 125));
        System.out.println(index);
    }
}
class Employee2 implements Comparable<Employee2>{
    int id;
    String name;
    int salary;

    public Employee2(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
//  \\compareTo//
//  определяет порядок сортировки
//  если разность между элементами == 0 то элементы равны.
//  если  разность между элементами - 1, то элемет уходит за текущий
//  если разность между элементами+ 1, то элемет уходит перед текущим
//
//  если элементы равны, то можно задать дополнитьельную сортировку по другому значению элемента через IF

    @Override
    public int compareTo(Employee2 anotherEmp) {
        int rezult = this.id - anotherEmp.id; //для чисел можно использовать разность
        if (rezult == 0) {
            rezult = this.name.compareTo(anotherEmp.name); //для String используется метод .compareTo()
        }
        return rezult;
    }
}
