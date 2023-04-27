package Lamda;

import javax.swing.text.Style;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentInfo {
    void testStudents(ArrayList<Student> al, StudentChecks sc) {
        for (Student s : al) {
            if (sc.check(s)) {
                System.out.println(s);
            }
        }
    }

//    void printStudentOverGrade (ArrayList<Student> a1, double grade) {
//        for (Student s : a1) {
//            if (s.avgGrade > grade) {
//                System.out.println(s);
//            }
//        }
//    }
//    void printStudentUnderAge(ArrayList<Student> a1, int age) {
//        for (Student s : a1) {
//            if (s.age < age) {
//                System.out.println(s);
//            }
//        }
//    }
//    void printStudentMixCondition(ArrayList<Student> a1, int age, double grade, char sex) {
//        for (Student s : a1) {
//            if (s.age > age && s.avgGrade < grade && s.sex == sex) {
//                System.out.println(s);
//            }
//        }
//    }

}

class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.course-s2.course;
            }
        });
        Collections.sort(students, (stud1, stud2) -> stud1.course-stud2.course); //сортировка с помощью лямда, перезаписан класс compare
        System.out.println(students);
//        info.testStudents(students, new CheckOverGrade()); //используем класс который имплементирует интерфейс
//        System.out.println("____________________");
//        info.testStudents(students, new StudentChecks() { //можно применить анонимный класс как альтернативу
//            @Override
//            public boolean check(Student s) {
//                return s.age<30;
//            }
//        });
        info.testStudents(students, (Student s) -> {return s.avgGrade>8;}); //Длинная запись лямда выражений
        info.testStudents(students, (Student s) -> s.avgGrade>8); //Средняя запись лямда выражений (левая половиня полная)
        info.testStudents(students, (s) -> s.avgGrade>8); //упрощенная запись лямда выражений (левая половиня без указания типа)
        info.testStudents(students, s -> {return s.avgGrade>8;}); //Средняя запись лямда выражений (правая половиня полная)
        info.testStudents(students, s -> s.avgGrade>8); //Короткая запись лямда выражений
       // info.testStudents(students, (s, p) -> s.avgGrade>8); //Если в левой половине два параметра, то они д.б. в скобках, второй параметр мы можем не использовать в правой половине
        //НЕЛЬЗЯ писать левую половину с указанием параметра без скобок Student s
        //Если в правой половине написано более одного выражения то использование скобок return и ; обязательны
        info.testStudents(students, s -> {
            System.out.println("Privet");
            return s.avgGrade>8;
        });
        //использование лямда выржения через переменную интерфейса
        StudentChecks sc = (Student s) -> {return s.avgGrade>8;}; //Создается переменная интерфейса и в неё передается выражении лямды
        info.testStudents(students, sc);//используется переменная интерфейса в место лямда выражения, что дает возможность использовать её много раз

        System.out.println("____________________");
        info.testStudents(students, (Student s) -> {return s.age<30;}); //лямда выражение
        System.out.println("____________________");
        info.testStudents(students, (Student s) -> {return s.age>20 && s.avgGrade<9.3 && s.sex=='f';});
//        info.printStudentOverGrade(students, 8);
//        System.out.println("____________________");
//        info.printStudentUnderAge(students,30);
//        System.out.println("____________________");
//        info.printStudentMixCondition(students,20,9.5, 'f');
    }
}
interface StudentChecks{ //функциональный интерфейс
    boolean check(Student s);//содержит только один абстрактный метод (не абстрактные могут быть)
}

class CheckOverGrade implements StudentChecks {

    @Override
    public boolean check(Student s) {
        return s.avgGrade>8;
    }
}