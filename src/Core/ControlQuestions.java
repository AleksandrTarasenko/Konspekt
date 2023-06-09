package Core;

public class ControlQuestions {
    /*
    Все примитивные типы и их размеры
    Тип  - Размер, байт - Диапазон значений - Значение по умолчанию
    byte -      1       - -128 .. 127           -         0
    short -     2       - -32,768 .. 32,767     -         0
    int -       4       - -2*10^9 .. 2*10^9     -         0
    long -      8       - -9*10^18 .. 9*10^18   -         0
    float -     4       - -10^38 .. 10^38       -         0
    double -    8       - 10^308 .. 10^308      -         0
    boolean -   1       - true, false           -         false
    char -      2       -   0 .. 65,535         -        '\u0000'

    Какая размерность у boolean?
    В стандартной реализации Sun JVM и Oracle HotSpot JVM тип boolean занимает 4 байта (32 бита), как и тип int.
    Однако, в определенных версиях JVM имеются реализации, где в массиве boolean каждое значение занимает по 1-му биту
    boolean: The data type has only two possible values: and .
    Use this data type for simple flags that track true/false conditions.
    This data type represents one bit of information, but its "size" isn't something that's precisely defined.booleantruefalse
    boolean: тип данных имеет только два возможных значения: и .
    Используйте этот тип данных для простых флагов, которые отслеживают условия true/false.
    Этот тип данных представляет собой один бит информации, но его «размер» не является чем-то, что точно определено.booleantruefalse

    Что такое char? Почему над ним можно выполнять арифметические операции?
    тип данных представляет собой один 16-разрядный символ Юникода.
    Он имеет минимальное значение (или 0) и максимальное значение (или 65 535 включительно).char'\u0000''\uffff'

    Какие есть виды приведения типов? Что такое явные и неявные приведения, с чем связано их наличие?
    1. Расширение типа - операция проходит незаметно и безболезненно
    2. Сужение типа  - места может не хватить, и что-то придётся выбросить. (от каждого типа по разнице в битах)
    при сужении отбрасываются байты. сужение происходит через кастинг byte d = (byte) c; где с- это short

    Какие классы-обертки знаешь?
    byte - Byte
    short - Short
    int - Integer
    long - Long
    float - Float
    double - Double
    char - Character
    boolean - Boolean

    Расскажи про unboxing, autoboxing в обертках
    переменной-оболочке может быть присвоено примитивное значение. Этот процесс называется автобоксингом
    примитивной переменной можно присвоить объект-оболочку. Этот процесс называется распаковкой
    автобоксинг и распаковка не работают для массивов!
    Любая упаковка в Java равносильна созданию нового объекта.
    при работе с классам- обертками мы работаем с объектами. данные объекты могут быть null.
    Если число не входит в значения из кэша (т.е. в -128 до 127), то будет каждый раз создаваться новый объект.
    Ухудшение производительности. Автоупаковка или распаковка ухудшают производительность приложения,
    поскольку это создает нежелательный объект, из-за которого сборщику мусора приходится работать чаще.
    Отличие от parseInt в том, что результатом работы valueOf будет Integer, а не int

    Расскажи про pool строк и pool примитивов
    пул строк это кэш куда записываются и хранятся все новые неповторяющиеся значения
    пул примитивов, имеют в пуле значания ограниченны еразмером байта т.е от -128 до 127,
    вэтом влучае значение по == будут одинаковые для оболочек

    Как добавить String’у в pool строк?
    через = ""
    через  метод intern на новом String
    String firstStr = new String("Hello world").intern();

    Разница между String, StringBuilder и StringBuffer?
    String - immutable  не изменяемый, т.е. при при проведении операций по нему всегда создается новый объект
    StringBuilder и StringBuffer изменяемые
    при этом StringBuffer StringBuffer синхронизированный и потокобезопасный из-за чего медленный в однопоточных приложения
    StringBuilder/StringBuffer
    Конструктор без параметров резервирует в памяти место для 16 символов.
    С помощью метода capacity() мы можем получить количество символов
     помощью метода capacity() мы можем получить количество символов
     получить строку, которая хранится в StringBuffer, использовать стандартный метод toString():
     */


}
