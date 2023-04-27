package Map_interface;

import java.util.Objects;
import java.util.TreeMap;

public class TreeMapEx1 {
    public static void main(String[] args) {
//        TreeMap - отсортированный по возрастанию HashMap
        // реализован по принципу красно-черного самобалансирующегося двоичного дерева
        TreeMap<Double, Student2> treeMap = new TreeMap<>();
        Student2 st1 = new Student2("Aleksandr", "Tarasenko", 4);
        Student2 st2 = new Student2("Mariya", "Ivanova", 1);
        Student2 st4 = new Student2("Sergey", "Petrov", 4);
        Student2 st3 = new Student2("Igor", "Sidorov", 2);
        Student2 st5 = new Student2("Vasiliy", "Smirnov", 1);
        Student2 st6 = new Student2("Sasha", "Kapustin", 3);
        Student2 st7 = new Student2("Elena", "Sidorova", 4);
       // Student2 st8 = new Student2("Petr", "Sidorov", 4);
        treeMap.put(5.8, st1);
        treeMap.put(9.1, st7);
        treeMap.put(6.4, st2);
        treeMap.put(8.2, st6);
        treeMap.put(7.2, st3);
        treeMap.put(7.5, st4);
        treeMap.put(7.9, st5);
        //treeMap.put(9.1, st8); // если ключ одинаковыйй то данные будут перезаписаны
        System.out.println(treeMap);
    // \\descendingMap()//
        System.out.println(treeMap.descendingMap()); //разворачивает отсортированные ключи в обратном порядке
    // \\tailMap//
        System.out.println(treeMap.tailMap(7.3)); // выводит значения выше от указанного в методе до конца
    // \\headMap//
        System.out.println(treeMap.headMap(7.3)); // выводит значения ниже от указанного в методе до начала
    // \\lastEntry//
        System.out.println(treeMap.lastEntry());  // какой элемент находится в самом конце
    // \\firstEntry//
        System.out.println(treeMap.firstEntry());  // какой элемент находится в самом начале

    }
    
}
class Student2 {
    String name;
    String surename;
    int course;

    public Student2(String name, String surename, int course) {
        this.name = name;
        this.surename = surename;
        this.course = course;
    }

    @Override
    public String  toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", surename='" + surename + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student2 Student2 = (Student2) o;
        return course == Student2.course && Objects.equals(name, Student2.name) && Objects.equals(surename, Student2.surename);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surename, course);
    }

}
