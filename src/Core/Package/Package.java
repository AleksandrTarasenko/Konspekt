package Core.Package;

public class Package {
    /*
    Импорт пакетов и классов
    Если нам надо использовать классы из других пакетов, то нам надо подключить эти пакеты и классы.
    Исключение составляют классы из пакета java.lang (например, String), которые подключаются в программу автоматически.

    класс Scanner находится в пакете java.util, поэтому мы можем получить к нему доступ следующим способом:
    java.util.Scanner in = new java.util.Scanner(System.in);
    или
    Использовать импорт и использовать методы класса в сокращенном виде
    java.util.Scanner in = new java.util.Scanner(System.in);

    можем сразу подключить весь пакет:
    import java.util.*; * - означает весь пакет, а не конкретный метод

    Возможна ситуация, когда мы используем два класса с одним и тем же названием из двух разных пакетов,
    например, класс Date имеется и в пакете java.util, и в пакете java.sql.
    И если нам надо одновременно использовать два этих класса,
    то необходимо указывать полный путь к этим классам в пакете:
    java.util.Date utilDate = new java.util.Date();
    java.sql.Date sqlDate = new java.sql.Date();

    Статический импорт
    import static java.lang.Math.*;
    Эти классы имеют статические методы.
    Благодаря операции статического импорта мы можем использовать эти методы без названия класса.
    Например, писать не Math.sqrt(20), а sqrt(20), так как функция sqrt(),
     */
    /*
    Если оператор package не использован, тогда классы, интерфейсы, перечисления и типы аннотаций
    будут помещены в текущий пакет по умолчанию.

    Чтобы скомпилировать программы на Java с операторами package, то вам нужно использовать опцию –d, как показано ниже.
    javac -d Destination_folder file_name.java
    Пример $ javac -d . Animal.java

    класс Employee не будет включен в пакет payroll?
    Тогда класс Boss должен будет использовать одну из следующих техник для обращения к классу в другом пакете:
    Можно использовать полноценное имя класса. К примеру:
    payroll.Employee
    Импорт пакета. В Java пакет может быть импортирован с помощью ключевого слова import и wild card. (*). Например:
    import payroll.*;
    Сам класс можно импортировать с помощью ключевого слова import. Взглянем:
    import payroll.Employee;

    Ключевые моменты верного создания класса внутри пакета:

внутри класса должно использоваться ключевое слово package;
ключевое слово package должно быть в первой строке кода, перед импортами и объявлением самого класса;
после package нужно указать полное имя пакета, с корня пакета до пакета(папки) в которой размещен класс;
каждая отдельная папка, в полном имени пакета, отделяется точкой;
имя самого класса не входит в имя объявляемого пакета;
реальное расположение файла и полное имя пакета, после слова package, — должны соответствовать друг другу
     */
}