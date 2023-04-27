package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MinMaxLimitSkipMapToInt {
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
//  \\min//
        //ищет мин значение по критерию через компаратор
        Student2 min = students2.stream().min((x, y) -> x.getAge() - y.getAge()).get();
        System.out.println(min);
        System.out.println("---------------------------");
//  \\max//
        //ищет макс значение по критерию через компаратор
        Student2 max = students2.stream().max((x, y) -> x.getAge() - y.getAge()).get();
        System.out.println(max);
        System.out.println("---------------------------");
//  \\limit//
        //ограничивает вывод отфильтрованного списка до ограниченного методом количества
        students2.stream().filter(e->e.getAge()>20).limit(2).forEach(System.out::println);
        System.out.println("---------------------------");
//  \\skip//
        //пропускакет от начала отфильтрованного списка, количество к выводу указанного в его параметре
        students2.stream().filter(e->e.getAge()>20).skip(2).forEach(System.out::println);

//  \\mapToInt//  и \\boxed//
        List<Integer> courses = students2.stream()
                .mapToInt(el -> el.getCourse()) //есть mapToDouble и другие
                .boxed()// конвертирует метот int в метод Integer
                .collect(Collectors.toList());

        System.out.println(courses);
//  \\sum// суммирует
        int sum = students2.stream().mapToInt(el -> el.getCourse()).sum();
        System.out.println(sum);
//  \\average// Средне-авривметическое
        Double average = students2.stream().mapToInt(el -> el.getCourse()).average().getAsDouble();
        System.out.println(average);

//        \\min// минимальный курс
        int min2 = students2.stream().mapToInt(el -> el.getCourse()).min().getAsInt();
        System.out.println(min2);

//        \\max// Максимальный курс
        int max2 = students2.stream().mapToInt(el -> el.getCourse()).max().getAsInt();
        System.out.println(max2);
    }
}
