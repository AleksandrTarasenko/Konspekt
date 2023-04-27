package Lamda.Predicate;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;

public class StudentInfo {
    //Predicate позволяет не использовать собственный интерфейс, т.к. имеет встроенный интерфейс
    void testStudents(ArrayList<Student> al, Predicate<Student> pr) { //достаточно передать в параметры Predicate и имя класса
        for (Student s : al) {
            if (pr.test(s)) { //указать переменную и вызвать единственный метод test
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

        info.testStudents(students, (Student s) -> {return s.avgGrade>8;}); //Длинная запись лямда выражений

        info.testStudents(students, s -> {
            System.out.println("Privet");
            return s.avgGrade>8;
        });
        System.out.println("____________________");
        System.out.println("____________________");

        Predicate<Student> p1 = student -> student.avgGrade>7.5;
        Predicate<Student> p2 = student -> student.sex=='m';

        info.testStudents(students, p1.and(p2));//Можно объеденить две проверки
        info.testStudents(students, p1.or(p2));//Можно проверить удовлетворению одному из условий
        info.testStudents(students, p1.negate());//отрицание условия


        System.out.println("____________________");
        System.out.println("____________________");
        info.testStudents(students, (Student s) -> {return s.age<30;}); //лямда выражение
        System.out.println("____________________");
        info.testStudents(students, (Student s) -> {return s.age>20 && s.avgGrade<9.3 && s.sex=='f';});

    }
}

