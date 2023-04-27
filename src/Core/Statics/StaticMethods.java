package Core.Statics;

public class StaticMethods {
    /*
    Статические методы
    Статические методы также относятся ко всему классу в целом
    */
}
class Program3{
    public static void main(String[] args) {
        Person2.displayCounter();    // Counter: 1

        Person2 tom = new Person2();
        Person2 bob = new Person2();

        Person2.displayCounter();    // Counter: 3
    }
}
class Person2{

    private int id;
    private static int counter = 1;

    Person2(){
        id = counter++;
    }
    // статический метод
    public static void displayCounter(){

        System.out.printf("Counter: %d \n", counter);
    }
    public void displayId(){

        System.out.printf("Id: %d \n", id);
    }
    /*
    Теперь статическая переменная недоступна извне, она приватная.
    А ее значение выводится с помощью статического метода displayCounter.
    Для обращения к статическому методу используется имя класса: Person.displayCounter().

    При использовании статических методов надо учитывать ограничения:
    в статических методах мы можем вызывать только другие статические методы
    и использовать только статические переменные.
     */
}

