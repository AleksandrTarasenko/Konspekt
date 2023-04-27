package Map_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class EntrySetHashCodeEx1 {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Aleksandr", "Tarasenko", 4);
        Student st2 = new Student("Mariya", "Ivanova", 1);
        Student st3 = new Student("Sergey", "Petrov", 3);
        map.put(st1, 7.5);
        map.put(st2, 8.7);
        map.put(st3, 9.2);
        System.out.println(map);
        //скорость получения данных для HashMap O(1),
        // однако он может быть O(n), если неправильно организован, т.к. HashMap со стоит из LinkedList(всязанные списки)
        // если HashMap с помощью LinkedList не справляется, то применяется сбалансированные деревья (бинарное дерево) использующее O(log n)
        //       ((10))  //. бинарное дерево делит список на меньшие значения слева, большие справа
        //      /     \     //и проверяется в какой из сторон искомое значение, туда и двигается
        //    (7)    ((12))   // в этом примере ищем 16, 16>10==true - идем вправо
        //   /   \   /    \   // 16>12==true - идем вправо
        // (3)  (9) (11) ((16))  // 16>16==true, значение найдено

        Student st4 = new Student("Aleksandr", "Tarasenko", 4);
        Student st5 = new Student("Igor", "Sidorov", 4);
        boolean rezult = map.containsKey(st4);
        System.out.println("rezult = " + rezult); //если метод hashCode не переопределен то rezult будет = false
        System.out.println("equals = " + st1.equals(st4)); //equals =true

        System.out.println(st1.hashCode());//Получаем числовое значение hashCode объекта
        System.out.println(st5.hashCode());//по умолчанию даде если метод hashCode не переопределен, то значения имеются
//  \\map.entrySet()//
        //выводит значенние Node (ключ, значение, hashCode, ссылку на след элемент)
        //по этому с помощью entry мы можем получить Key, Value
        for (Map.Entry<Student, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        Map<Integer, String> map2 = new HashMap<>(16, 0.75f);
        //16 - это размер по умолчанию для HashMap
        //0.75f - явл float, буква f после значения обязательна
        //0.75 - размер, при скольких заполненых значениях (от 16 это 12), размер HashMap будет увеличен в два раза
        //пожно пожертвовать памятью 16 сделать больше, но увеличить скорость получения данных

        //Очень ВАЖНО использовать в качестве ключа immutable (неизменяемые) объекты, т.к иначе меняется значение hashCode
        // и в этом случае мы никогда ненайдем объект по hashCode
        // Можно установить final для class Student (что бы не мог иметь наследников),
        // а так же final для каждого поля данных в этом классе
        //так же нужно применить инкапслюкацию (private) и использовать Getter
    }
}

class Student {
    String name;
    String surename;
    int course;

    public Student(String name, String surename, int course) {
        this.name = name;
        this.surename = surename;
        this.course = course;
    }

    @Override
    public String  toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surename='" + surename + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surename, student.surename);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surename, course);
    }
//    @Override
//    public int hashCode() {//можно создать своё переопределение
//        return name.length()*7  + surename.length() *11+ course*53;// используя сумму длины имен и чисел
//        //однако суммы будут очень малы и количество совпадений сильно возрастет
//        //необходимо использовать каждое число умноженное на простое число(делится только на себя)
//    }
}