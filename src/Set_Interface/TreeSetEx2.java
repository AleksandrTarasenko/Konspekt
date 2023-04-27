package Set_Interface;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();
        Student st1 = new Student("Aleksandr", 5);
        Student st2 = new Student("Misha", 1);
        Student st4 = new Student("Igor", 2);
        Student st3 = new Student("Marina", 3);
        Student st5 = new Student("Olya", 4);
        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        treeSet.add(st5);
        System.out.println(treeSet);

        Student st6  = new Student("Oleg", 2);
        Student st7  = new Student("Ivan", 4);
        System.out.println(treeSet.first()); //первый по списку
        System.out.println(treeSet.last()); // последний по списку
        System.out.println(treeSet.headSet(st6)); // вывод студентов ниже чем текущий
        System.out.println(treeSet.tailSet(st6)); // вывод студентов равен или выше чем текущий
        System.out.println(treeSet.subSet(st6,st7)); // получение подмножества из множества

        //при переопределении метода equals должно выполнятся требование
        // a.equals(b) == true
        // a.compareTo(b) == 0
        // следовательно при переопределении метода equals и метода hashCode
        // необходимо перезаписывать только те поля, которые сравниваются в compareTo
        System.out.println(st4.equals(st6));
        System.out.println(st4.hashCode()==st6.hashCode());
    }
}

class Student implements Comparable<Student> {
    String name;
    int course;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;

    }

    @Override
    public int compareTo(Student other) {
        return this.course-other.course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }
}
