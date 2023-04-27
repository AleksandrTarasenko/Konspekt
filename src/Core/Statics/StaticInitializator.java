package Core.Statics;

public class StaticInitializator {

}
class Program2{
    /*
    Статические инициализаторы предназначены для инициализации статических переменных,
    либо для выполнения таких действий, которые выполняются при создании самого первого объекта.
     */
    public static void main(String[] args) {
        Person tom = new Person();
        Person bob = new Person();

        tom.displayId();    // Id = 105
        bob.displayId();    // Id = 106
    }
}
class Person{
    private int id;
    static int counter;
    static{
        counter = 105;
        System.out.println("Static initializer");
    }
    Person(){
        id=counter++;
        System.out.println("Constructor");
    }
    public void displayId(){
        System.out.printf("Id: %d \n", id);
    }
    //Статический инициализатор определяется как обычный, только перед ним ставится ключевое слово static.
    /*
    Вывод в консоль
    Static initializer
    Constructor
    Constructor
    Id: 105
    Id: 106
     */
}
