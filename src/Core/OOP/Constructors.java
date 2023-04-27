package Core.OOP;

public class Constructors {
    /*
    Конструктор — это специальный метод, который вызывается при создании нового объекта
    Имя конструктора совпадает с именем класса, включая регистр,
    а по синтаксису конструктор похож на метод без возвращаемого значения
    public Cat() {
    }
    В отличие от метода, конструктор никогда ничего не возвращает.

    можем создать конструктор, который будет создавать коробки с заданными параметрами
    Box(int width, int height, int depth) {
    this.width = width;
    this.height = height;
    this.depth = depth;
    Ключевое слово this представляет ссылку на текущий экземпляр класса
}
     */
    //enum или перечисление. Перечисления представляют набор логически связанных констант
    public static void main(String[] args) {
        Day current = Day.MONDAY;
        System.out.println(current);
    }
    public enum Day {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
    /*Методы перечислений
    Каждое перечисление имеет статический метод values(). Он возвращает массив всех констант перечисления.
    public class Program {

    public static void main(String[] args) {
        Type[] types = Type.values();
        for (Type s : types) {
            System.out.println(s);
        }
    }
}
enum Type {
    SCIENCE,
    BELLETRE,
    PHANTASY,
    SCIENCE_FICTION
}
Метод ordinal() возвращает порядковый номер определенной константы (нумерация начинается с 0).
System.out.println(Type.BELLETRE.ordinal());

Конструкторы, поля и методы перечисления
Перечисления, как и обычные классы, могут определять конструкторы, поля и методы. Например:
public class Program {

    public static void main(String[] args) {

        System.out.println(Color.RED.getCode());        // #FF0000
        System.out.println(Color.GREEN.getCode());      // #00FF00


    }
}
enum Color {
    RED("#FF0000"), BLUE("#0000FF"), GREEN("#00FF00");
    private String code;
    Color(String code){
        this.code = code;
    }
    public String getCode() {
        return code;
    }
}
Перечисление Color определяет приватное поле code для хранения кода цвета,
а с помощью метода getCode оно возвращается.
Через конструктор для него передается значение.
Следует отметить, что конструктор по умолчанию приватный, то есть имеет модификатор private.
Любой другой модификатор будет считаться ошибкой.
Поэтому создать константы перечисления с помощью конструктора мы можем только внутри перечисления.
Также можно определять методы для отдельных констант.

public class Program{

    public static void main(String[] args) {

        Operation op = Operation.SUM;
        System.out.println(op.action(10, 4));   // 14
        op = Operation.MULTIPLY;
        System.out.println(op.action(6, 4));    // 24
    }
}
enum Operation{
    SUM {
        public int action(int x, int y) {
            return x + y;
        }
    },
    SUBTRACT {
        public int action(int x, int y) {
            return x - y;
        }
    },
    MULTIPLY {
        public int action(int x, int y) {
            return x * y;
        }
    };

    public abstract int action(int x, int y);
}
     */



}
