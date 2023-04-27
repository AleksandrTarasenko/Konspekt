package Annatation_Example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@MyAnnotation
public class Employee {

    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    @MyAnnotation
    public void increaseSalary() {
        salary *= 2;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
@Target({ElementType.METHOD, ElementType.TYPE}) //@Target показывает область кода, к которой (созданная) Аннотация может быть применима
    //для указания нескольких областей кода, для этого нужно области взять в фигурные скобки и перечислить через запятую
    /*
    Самые распространённые области кода: (их множество можно выбрать)
    • TYPE – class, interface, enum;
    • FIELD – поле класса;
    • METHOD – метод класса;
    • PARAMETER – параметры метода или конструктор
    вызывается с помощью ключевого слова ElementType
     */
@Retention(RetentionPolicy.RUNTIME) // @Retention описывает жизненный цикл Аннотации
    /*
    • SOURCE – Аннотация видна в source коде, отбрасывается компилятором и уже в byte коде не видна;
    • CLASS – Аннотация видна в byte коде, отбрасывается JVM во время выполнения программы;
    • RUNTIME – Аннотация видна во время выполнения программы.(Чаще используется при создании своих аннотаций)
    Вызывается через RetentionPolicy
     */
@interface MyAnnotation { //создание аннотации через @ и ключевого имени interface
    //Аннотацию можно добавить в любое место если не ограничена аннотацией Target

}
