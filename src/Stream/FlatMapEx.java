package Stream;

import java.util.ArrayList;
import java.util.List;

public class FlatMapEx {
    public static void main(String[] args) {
        Student2 st1 = new Student2("Ivan", 'm', 22, 3, 8.3);
        Student2 st2 = new Student2("Nikolay", 'm', 28, 2, 6.4);
        Student2 st3 = new Student2("Elena", 'f', 19, 1, 8.9);
        Student2 st4 = new Student2("Petr", 'm', 35, 4, 7);
        Student2 st5 = new Student2("Mariya", 'f', 23, 3, 9.1);


        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Applied mathematics");

        f1.addStudentOnFaculty(st1);
        f1.addStudentOnFaculty(st2);
        f1.addStudentOnFaculty(st3);
        f2.addStudentOnFaculty(st4);
        f2.addStudentOnFaculty(st5);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);
//  \\FlatMap//
        //Используется для вызова списков списков
        //вызываем stream на лист факультетов. Затем вызываем flatMap
        // лямда запрашиваем получение студентов по каждому факультету и вызываем на него метод stream
        // выводим общий список через forEach и лямда в нем через  e.getName()
        facultyList.stream().flatMap(faculty -> faculty.getStudentsOnFaculty().stream())
                .forEach(e-> System.out.println(e.getName()));
    }
}

class Faculty {
    String name;
    List<Student2> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        this.studentsOnFaculty = new ArrayList<>();
    }

    public List<Student2> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    public void addStudentOnFaculty(Student2 stud) {
        studentsOnFaculty.add(stud);
    }
}