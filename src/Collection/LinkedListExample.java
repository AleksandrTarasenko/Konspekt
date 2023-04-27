package Collection;


import java.util.LinkedList;

public class LinkedListExample {
//  \\LinkedList//
//  Имеет тип ссылки Doubly (каждый элемент помимо значения хранит в себе ссылку на предыдущий элемент и последующий)
//  Можно создать также SINGLY LinkedList имеющий только один т ип ссыки (прямой) на следующий элемент
    public static void main(String[] args) {
        Student2 st1 = new Student2("Ivan", 3);
        Student2 st2 = new Student2("Nikolay", 2);
        Student2 st3 = new Student2("Elena", 1);
        Student2 st4 = new Student2("Petr", 4);
        Student2 st5 = new Student2("Mariya", 3 );
        LinkedList<Student2> student2LinkedList = new LinkedList<>();
        student2LinkedList.add(st1);
        student2LinkedList.add(st2);
        student2LinkedList.add(st3);
        student2LinkedList.add(st4);
        student2LinkedList.add(st5);
        System.out.println("LinkedList = " + student2LinkedList);
        System.out.println(student2LinkedList.get(2));
        Student2 st6 = new Student2("Alex", 3);
        Student2 st7 = new Student2("Igor", 4);
//  \\add// добавление
        student2LinkedList.add(st6);
        System.out.println("LinkedList = " + student2LinkedList);
        student2LinkedList.add(1, st6); //добавление на индекс 1 студента st6
//  \\remove//
        student2LinkedList.remove(3); //сам элемент из памяти не удаляется,
        // убирается ссылка на него, и предыдущий и последующий элемент этого элемента ссылаются между собой

    }
}

class Student2 {
    String name;
    int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}