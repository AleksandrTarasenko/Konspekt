package Annatation_Example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class AnnatationEx {
    /*
    Аннотации – это специальные комментарии/метки/метаданные, которые нужны для передачи определённой информации.
     */
    public static void main(String[] args) {
        Parent p = new Child("Aleksandr");
        p.showInfo(); // @Deprecated // Метод устарел
    }
}

class Parent {
    String name;

    public Parent(String name) {
        this.name = name;
    }
    // Метод устарел, необходимо указывать какой стал вместо него в описании и причину
    @Deprecated
        void showInfo () {
        System.out.println("It's Parent class. Name = " + name);
    }
}

class Child extends Parent {

    public Child(String name) {
        super(name);
    }
   @Override //при перезаписывании аннотация @Override позволяет избежать ошибок такие как
       // ошибка в имени перезаписываемого метода, что создает 2 различных метода
       // добавление параметра в скобки отличительного от перезаписываемого
        //изменение имени родительского метода, как следствие создается 2 различных метода для родителя и ребенка
    void showInfo () {
        System.out.println("It's Child class. Name = " + name);
    }
}
@Target({ElementType.METHOD, ElementType.TYPE}) //@Target показывает область кода, к которой (созданная) Аннотация может быть применима
//для указания нескольких областей кода, для этого нужно области взять в фигурные скобки и перечислить через запятую
    /*
    Самые распространённые области кода: (их множество можно выбрать)
    ElementType.ANNOTATION_TYPE. Применяется к аннотации
    ElementType.CONSTRUCTOR. Применяется к конструктору.
    ElementType.FIELD. Применяется к полю или свойству.
    ElementType.LOCAL_VARIABLE. Применяется к локальной переменной.
    ElementType.METHOD. Применяется к методу.
    ElementType.PARAMETER. Применяется к параметру метода.
    ElementType.TYPE. Применяется к любому элементу класса.
     */
@Retention(RetentionPolicy.RUNTIME) // @Retention описывает жизненный цикл Аннотации
    /*
    • SOURCE – Аннотация видна в source коде, отбрасывается компилятором и уже в byte коде не видна;
    • CLASS – Аннотация видна в byte коде, отбрасывается JVM во время выполнения программы;
    • RUNTIME – Аннотация видна во время выполнения программы.(Чаще используется при создании своих аннотаций)
    Вызывается через RetentionPolicy
     */
@interface MyAnnotation1 { //создание аннотации через @ и ключевого имени interface
    //Аннотацию можно добавить в любое место если не ограничена аннотацией Target
}
/*
@Deprecated - Помеченный этой аннотацией элемент устарел и больше не должен использоваться
@Override - Информирует компилятор о том, что аннотируемый элемент должен переопределять элемент родительского класса.
@SuppressWarnings - Подавляет генерируемые компилятором предупреждения.
Предупреждения делятся на непроверенные (unchecked) и устаревшие (deprecation).
Первые возникают при использовании устаревшего кода, написанного до дженериков,
вторые - при использовании кода, помеченного аннотацией @Deprecated.
@SafeVarargs - Применяется к методу или конструктору и утверждает, что код не выполняет потенциально небезопасных операций с параметрами varargs.
При использовании аннотации подавляются unchecked предупреждения, связанные с varargs.
@FunctionalInterface - Используется при описании функционального интерфейса. Подчеркивает, что это именно функциональный интерфейс.

Аннотации, применимые к другим аннотациям (мета-аннотации)
----------------------------------------------------------
@Retention - описывает жизненный цикл Аннотации (см выше)
@Documented - Указывает, что аннотация, должна быть задокументирована в Javadoc (по умолчанию аннотации не документируются).
@Target - показывает область кода, к которой (созданная) Аннотация может быть применима
@Inherited - Аннотация будет наследоваться дочерним классом (по умолчанию аннотации не наследуются).
Применима только к описаниям классов.
@Repeatable - Указывает, что аннотация повторяющаяся. (см пример ниже)
 */

/*
Аннотации начинаются с @, могут включать элементы, которым присваиваются значения.
@Author(
        name = "Benjamin Franklin"
        date = "3/27/2003"
)
class MyClass{...}
Если такой элемент один, его имя можно опустить.

@SupressWarnings("unchecked")
void MyMethod() {...}

Если таких элементов нет, можно опустить скобки. Можно использовать несколько аннотаций в одном объявлении.

@Author(name = "Jane Doe")
@EBook
class MyClass { ... }
Аннотации могут быть повторяющимися.

@Author(name = "Jane Doe")
@Author(name = "John Smith")
class MyClass { ... }

Для добавления аннотации в Javadocs нужно использовать @Documented:

Допустим, в какой-то IT-компании тела всех классов начинаются с комментариев, содержащих важную информацию:
Описание аннотации, которая заменит комментарии:
@interface ClassPreamble {
    String author();
    String date();
    int currentRevision() default 1;
    String lastModified() default "N/A";
    String lastModifiedBy() default "N/A";
    // Можно использовать массив
    String[] reviewers();
 }
 Использование созданной аннотации:
 @ClassPreamble (
    author = "John Doe",
    date = "3/17/2002",
    currentRevision = 6,
    lastModified = "4/12/2004",
    lastModifiedBy = "Jane Doe",
    reviewers = {"Alice", "Bob", "Cindy"}
)
public class Generation3List extends Generation2List {
...
...
}
 */
/*
Повторяющиеся аннотации
Допустим, вам надо написать аннотацию, запускающую метод в заданное время или по определенному расписанию.
В примере созданная аннотация @Schedule будет запускать метод каждый последний день месяца и каждую пятницу в 23:00.
@Schedule(dayOfMonth="last")
@Schedule(dayOfWeek="Fri", hour="23")
public void doPeriodicCleanup() { ... }

Создание повторяющейся аннотации
1. Описание повторяющейся аннотации
Аннотация должна быть помечена @Repeatable, в скобках указан тип контейнера аннотаций.
import java.lang.annotation.Repeatable;

@Repeatable(Schedules.class)
public @interface Schedule {
    String dayOfMonth() default "first";
    String dayOfWeek() default "Mon";
    int hour() default 12;
}
Контейнер должен содержать массив повторяющихся аннотаций.
public @interface Schedules {
    Schedule[] value();
}
Получение повторяющихся аннотаций
Reflection API предоставляет методы для получения аннотаций.
При получении повторяющихся аннотаций поведение методов, которые возвращают одну аннотацию (например, AnnotatedElement.getAnnotation(Class<T>)) не меняется.
Если нужно вернуть более одной, то необходимо сначала получить контейнер. Таким образом устаревший код продолжает работать. Также, для получения повторяющихся аннотаций можно использовать методы Java SE 8 ('AnnotatedElement.getAnnotationsByType(Class)').
 */