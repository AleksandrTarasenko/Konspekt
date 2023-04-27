package Core.Statics;

public class KeyWorldStatic {
    /*
    Ключевое слово static
    Кроме обычных методов и полей класс может иметь статические поля, методы, константы и инициализаторы.
    Для объявления статических переменных, констант, методов и инициализаторов
    перед их объявлением указывается ключевое слово static.
     */
    //Например, создадим статическую переменную.
    public class Program{
        public  void main(String[] args) {
            Person tom = new Person();
            Person bob = new Person();

            tom.displayId();    // Id = 1
            bob.displayId();    // Id = 2
            System.out.println(Person.counter); // 3

            // изменяем Person.counter
            Person.counter = 8;

            Person sam = new Person();
            sam.displayId();    // Id = 8
        }
    }
    static class Person {
        private int id;
        static int counter = 1;
        Person() {
            id = counter++;
        }
        public void displayId() {
            System.out.printf("Id: %d \n", id);
        }
    }
    /*
    Класс Person содержит статическую переменную counter, которая увеличивается в конструкторе
    и ее значение присваивается переменной id.
    То есть при создании каждого нового объекта Person эта переменная будет увеличиваться,
    поэтому у каждого нового объекта Person значение поля id будет на один больше, чем у предыдущего.

    Так как переменная counter статическая, то мы можем обратиться к ней в программе по имени класса.
    System.out.println(Person.counter); // получаем значение
    Person.counter = 8;             	// изменяем значение

    /*Консольный вывод программы:
    Id = 1
    Id = 2
    3
    Id = 8
*/
}
