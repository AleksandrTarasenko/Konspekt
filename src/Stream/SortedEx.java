package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedEx {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};
//  \\sorted//
        //сортирует массив по возрастанию
        array = Arrays.stream(array).sorted().toArray(); //toArray() возвращает из stream в массив
        System.out.println(Arrays.toString(array)); //Arrays.toString преобразовывает 16-ричный вид в нормальный


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
//сортирует референсные типы данных по возрастанию чере компаратор
        students2 = students2.stream().sorted((x,y)->
                x.getName().compareTo(y.getName())
                ).collect(Collectors.toList());
        System.out.println(students2);
    }
}

class Student2 {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student2(String name, char sex, int age, int course, double avgGrade) {
        this.setName(name);
        this.setSex(sex);
        this.setAge(age);
        this.setCourse(course);
        this.setAvgGrade(avgGrade);
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public char getSex() {return sex;}

    public void setSex(char sex) {this.sex = sex;}

    public int getAge() {return age;}

    public void setAge(int age) {this.age = age;}

    public int getCourse() {return course;}

    public void setCourse(int course) {this.course = course;}

    public double getAvgGrade() {return avgGrade;}

    public void setAvgGrade(double avgGrade) {this.avgGrade = avgGrade;}
}
