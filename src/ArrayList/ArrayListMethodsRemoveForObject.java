package ArrayList;

import java.util.ArrayList;
import java.util.Objects;

//Удаление объекта типа Student из ArrayList по средством перезаписи метода equals

public class ArrayListMethodsRemoveForObject {
    public static void main(String[] args) {
                Student student1 = new Student("Ivan", 'm', 23, 4, 8.3);
        Student student2 = new Student("Petr", 'm', 20, 1, 86.4);
        Student student3 = new Student("Mariya", 'f', 21, 2, 8.9);
        Student student4 = new Student("Eva", 'f', 24, 5, 7);
        Student student5 = new Student("Stepan", 'm', 22, 3, 7.4);
        ArrayList<Student> studentsList = new ArrayList<>();
        studentsList.add(student1);
        studentsList.add(student2);
        studentsList.add(student3);
        studentsList.add(student4);
        studentsList.add(student5);
        System.out.println(studentsList);
        Student student6 = new Student("Stepan", 'm', 22, 3, 7.4);
//  \\ Метод remove//
        studentsList.remove(student6);
        //нелзя удалить из листа элемент не добавленный в него, даже если он полнстью одинаковый с элементом в листе
        //удаление возможно, если переопределить метод equals
        System.out.println(studentsList);
        //studentsList.remove(student5); //можно удалить элемент который есть в листе
//    \\Метод indexOf//
        Student student7 = new Student("Eva", 'f', 24, 5, 7);
        int index = studentsList.indexOf(student7);
        //нелзя Получить № индекса элемента из листа если он не добавлен в него, даже если он полнстью одинаковый с элементом в листе
        //Получить № индекса  возможно, если переопределить метод equals
        System.out.println(index);
    }

}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrate;

    public Student(String name, char sex, int age, int course, double avgGrate) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrate = avgGrate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrate=" + avgGrate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex &&
                age == student.age &&
                course == student.course &&
                Double.compare(student.avgGrate, avgGrate) == 0 &&
                Objects.equals(name, student.name);
    }


}
