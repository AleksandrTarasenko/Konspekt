package Core.AccessModifiers;

public class ExtendsНаследование {
    /*
    Чтобы объявить один класс наследником от другого,
    надо использовать после имени класса-наследника ключевое слово extends,
    class Employee extends Person

    Если в базовом классе определены конструкторы, то в конструкторе производного класса,
     необходимо вызвать один из конструкторов базового класса с помощью ключевого слова super.

     class Person {

    String name;
    public String getName(){ return name; }

    public Person(String name){

        this.name=name;
    }

    public void display(){

        System.out.println("Name: " + name);
    }
}
class Employee extends Person{
    public  Employee(String name){
        super(name);    // если базовый класс определяет конструктор
                        //  то производный класс должен его вызвать
                        //если конструктора 2
    }
}
так то же можно
public Employee(String name, String company) {

        super(name);
        this.company=company;
    }
     */
    /*
    В Java родитель может быть только один
    Таким образом, описав класс Родитель, мы описали и все остальные дочерние классы.
    То есть классы дочерние классы унаследовали все поля и методы класса Родителя.
     */
    /*
    Переопределение методов
    Производный класс может определять свои методы, а может переопределять методы,
    которые унаследованы от базового класса.
    При переопределении метода он должен иметь уровень доступа не меньше, чем уровень доступа в базовом класса.
    Например, если в базовом классе метод имеет модификатор public,
    то и в производном классе метод должен иметь модификатор public.

    С помощью ключевого слова super мы также можем обратиться к реализации методов базового класса.
    @Override
    public void display(){

        super.display();

    Метод помечается @Override аннотацией всякий раз, когда он разрешен.
    Это включает в себя метод класса, переопределяющий метод суперкласса,
    метод класса, реализующий метод интерфейса,
    и метод интерфейса, соответствующий методу суперинтерфейса.

    Исключение: @Override может быть опущено, когда родительский метод @Deprecated.

    Запрет наследования
    можно запретить наследование с помощью ключевого слова final
     */
}
