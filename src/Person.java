import java.util.Objects;

public class Person {
    private int age;
    private int number;
    private double salary;
    private String name;
    private CarKey carKey;

    public Person(int age, int number, String name, double salary, CarKey carKey) {
        this.age = age;
        this.number = number;
        this.name = name;
        this.salary = salary;
        this.carKey = carKey;
    }

    public boolean equals(Object o) {
        //необходимо проверить: а не является ли obj null-ом, чтобы обезопасить себя от java.lang.NullPointerException
        if (this == null) {
            return false;
        }
        //необходимо проверить: ссылается ли объект по ссылке obj, на наш текущий, на this
        if (this == o) {
            return true;
        }
        //необходимо проверить: объект по ссылке obj этого класса или другого класса
        if (getClass() != o.getClass()) {
            return false;
        }
        //ссылку "o" нужно безопасно скастовать к нашему классу
        Person person = (Person) o;
        //и сделать сравнение полей:
        if (age != person.age) return false; //сравниваем возраст
        if (number != person.number) return false; //номер
        if (Double.compare(person.salary, salary) != 0) return false; //compare - сравнивает 2 значения double
        if (!Objects.equals(name, person.name)) return false; // имя
        return Objects.equals(carKey, person.carKey); //сравниваем ключи
    }
    //    @Override
//    public int hashCode() {
//        return Objects.hash(re, im);
//    }
    public int hashCode(){ // Самостоятельная реализация
        int result = 31;
        result = result * 17 + age;
        result = result * 17 + number;

        long lnum = Double.doubleToLongBits(number);
        result = result * 17 + (int)(lnum ^ (lnum >>> 32));

        result = result * 17 + name.hashCode();
        result = result * 17 + carKey.hashCode();

        return result;
    }
    /*
    Если вызвать метод hashCode на одном и том же объекте, состояние которого не меняли, то будет возвращено одно и то же значение.
    Если два объекта равны, то вызов hashCode для каждого обязан давать один и тот же результат.
    Равенство объектов проверяется через вызов метода equals.

    Если два объекта имеют один и тот же hash-код, то это не гарантирует равенства объектов.
    Правила вычисления hashCode:

Присваиваем переменной result ненулевое значение - базу.

Далее для каждого значимого поля в объекте вычисляем hashCode, по следующим правилам:

Если поле boolean - (f ? 1 : 0)

Если поле byte, char, short или int - (int) f

Если поле long - (int)(f ^ (f >>> 32))

Если поле float, то Float.floatToIntBits(f);

Если поле double, то Double.doubleToLongBits(f), а затем как с long.

Если поле это ссылка на другой объект, то рекурсивно вызовите hashCode()

Если поле null, то возвращаем 0.

Если поле это массив, то обрабатываем так, как будто каждый элемент массива - это поле объекта.

Также, с версии Java 8+ в классе java.util.Objects есть вспомогательные методы для генерации hashCode:

@Override
public int hashCode() {
    return Objects.hash(age, number, salary, name, carKey);
}
     */
    class CarKey {}

}
