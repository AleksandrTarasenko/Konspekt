package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByPartitioningBy {
    public static void main(String[] args) {
        Student2 st1 = new Student2("Ivan", 'm', 22, 3, 8.3);
        Student2 st2 = new Student2("Nikolay", 'm', 28, 2, 6.4);
        Student2 st3 = new Student2("Elena", 'f', 19, 1, 8.9);
        Student2 st4 = new Student2("Petr", 'm', 35, 4, 7);
        Student2 st5 = new Student2("Mariya", 'f', 23, 3, 9.1);
        List<Student2> students2 = new ArrayList<>();
        students2.add(st1);
        students2.add(st2);
        students2.add(st3);
        students2.add(st4);
        students2.add(st5);
//  \\collect//
        //использывание collect совместно с его методом Collectors.groupingBy позволяет создать группировку в новый Map список
        //в данном примере создание группировки Map курс-студенты
        Map<Integer, List<Student2>> map = students2.stream().map(el -> {
                    el.setName(el.getName().toUpperCase());
                    return el;
                })
//  \\Collectors.groupingBy//
//      использывание collect совместно с его методом Collectors.groupingBy позволяет создать группировку в новый Map список
                //в данном примере создается Map -  ключ № курса, значение список студентов
                .collect(Collectors.groupingBy(el -> el.getCourse()));

        for (Map.Entry<Integer, List<Student2>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }
//  \\Collectors.partitioningBy//
        //Позволяет создать два Map удовлетворяющий условию и не удовлетворяющих условию
        //ключи true или false, значения перечень студентов
        Map<Boolean, List<Student2>> map2 =
                students2.stream().collect(Collectors.partitioningBy(el -> el.getAvgGrade()>7));

        for (Map.Entry<Boolean, List<Student2>> entry : map2.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }
    }
}
