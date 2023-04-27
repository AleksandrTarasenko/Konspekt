package Map_interface;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeMap;

public class TreeMapEx2 {
    public static void main(String[] args) {
//        TreeMap может содержать в качестве ключа референсные типы данных, однако класс должен быть отсортирован через Comparable<Student3>
        TreeMap<Student3, Double > treeMap = new TreeMap<>();
        // так же это условие может быть прописано присоздании TreeMap в параметре TreeMap через Comparator
        TreeMap<Student3, Double > treeMap2 = new TreeMap<>(new Comparator<Student3>() {
            @Override
            public int compare(Student3 o1, Student3 o2) {
                return 0;
            }
        });
        Student3 st1 = new Student3("Aleksandr", "Tarasenko", 4);
        Student3 st2 = new Student3("Mariya", "Ivanova", 1);
        Student3 st4 = new Student3("Sergey", "Petrov", 4);
        Student3 st3 = new Student3("Igor", "Sidorov", 2);
        Student3 st5 = new Student3("Vasiliy", "Smirnov", 1);
        Student3 st6 = new Student3("Sasha", "Kapustin", 3);
        Student3 st7 = new Student3("Elena", "Sidorova", 4);

        treeMap.put(st1,5.8 );
        treeMap.put(st7,9.1 );
        treeMap.put(st2, 6.4 );
        treeMap.put(st6,8.2 );
        treeMap.put( st3,7.2);
        treeMap.put(st4, 7.5 );
        treeMap.put(st5, 7.9 );

        System.out.println(treeMap);


    }
    
}
class Student3 implements Comparable<Student3> {
    String name;
    String surename;
    int course;

    public Student3(String name, String surename, int course) {
        this.name = name;
        this.surename = surename;
        this.course = course;
    }

    @Override
    public String  toString() {
        return "Student3{" +
                "name='" + name + '\'' +
                ", surename='" + surename + '\'' +
                ", course=" + course +
                '}';
    }
    //в TreeMap можно не переопределять методы equals и hashCode, однако это плохая привычка
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student3 Student3 = (Student3) o;
        return course == Student3.course && Objects.equals(name, Student3.name) && Objects.equals(surename, Student3.surename);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surename, course);
    }

    @Override
    public int compareTo(Student3 o) {
        return this.name.compareTo(o.name);
    }
}
