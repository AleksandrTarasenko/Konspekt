package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChainingFindFirst {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};
    //\\Метод Chaining// - импользование методов друг за другом .stream().filter().map().reduce().getAsInt() (или других)

    //в примере фильтруем с помощью метода filter и оставлям только нечетные
        // методом map делим числа если делятся нацело на 3, остальные оставляем без изменений
        //методом reduce складымаем все получивщиеся значения
        int rezult = Arrays.stream(array).filter(e->e%2==1)
                .map(e->{if (e%3==0){e=e/3;}return e;})
                .reduce((a,e) -> a+e).getAsInt();  //getAsInt() - верни значение как int
        System.out.println(rezult);

        Student3 st1 = new Student3("Ivan", 'm', 22, 3, 8.3);
        Student3 st2 = new Student3("Nikolay", 'm', 28, 2, 6.4);
        Student3 st3 = new Student3("Elena", 'f', 19, 1, 8.9);
        Student3 st4 = new Student3("Petr", 'm', 35, 4, 7);
        Student3 st5 = new Student3("Mariya", 'f', 23, 3, 9.1);
        List<Student3> students3 = new ArrayList<>();
        students3.add(st1);
        students3.add(st2);
        students3.add(st3);
        students3.add(st4);
        students3.add(st5);

    //в примере делаем Имена большими буквами, выводим только девушек, отсортируем по возрастру
        students3.stream()
                .map(element ->
        {element.setName(element.getName().toUpperCase());
        return element;})
                .filter(element -> element.getSex()=='f')
                .sorted((x,y)->x.getAge()-y.getAge())
                .forEach(element -> System.out.println(element));
//  \\findFirst//
        //ищет первое значение в отсортированном списке
        Student3 first = students3.stream()
                .map(element ->
                {
                    element.setName(element.getName().toUpperCase());
                    return element;
                })
                .filter(element -> element.getSex() == 'f')
                .sorted((x, y) -> x.getAge() - y.getAge())
                .findFirst().get();
        System.out.println(first);
    }
}
class Student3 {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student3(String name, char sex, int age, int course, double avgGrade) {
        this.setName(name);
        this.setSex(sex);
        this.setAge(age);
        this.setCourse(course);
        this.setAvgGrade(avgGrade);
    }

    @Override
    public String toString() {
        return "Student3{" +
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