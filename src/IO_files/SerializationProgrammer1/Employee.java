package IO_files.SerializationProgrammer1;

import java.io.Serializable;

public class Employee implements Serializable {
    //для передачи референсных типов данных, необходимо, что бы класс имплементировал Serializable
    static final long serialVersionUID = 2;
    //В сериализируемом классе необходимо использовать serialVersionUID для обозначения версии класса
    String name;
    String surname;
    String department;
//    int age;
    transient double salary; // transient - временный, позволяет ограничить передачу данной информации
    //будет передаваться значение по умолчанию
    Car car;

    public Employee (String name,
                     String surname,
                     String department,
//                     int age,
                     double salary, Car car) {
        this.name = name;
        this.surname = surname;
        this.department = department;
//        this.age = age;
        this.salary = salary;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                "surname='" + surname + '\'' +
                ", department='" + department + '\'' +
//                ", age=" + age +
                ", salary=" + salary +
                ", car=" + car +
                '}';
    }
}
