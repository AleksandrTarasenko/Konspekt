package Nested_Class.Static_Nested_Class;

public class Car {
    // Внутренний класс будет Статическим элементом внутри внешнего класса
    // Внутренний класс нужен тогда когда хотим привязать один класс к другому, сделать его элементом внешнего класса
    // Внутренний Класс должен напрямую быть связан со внешним (внешний машина - внутренний мотор)
    // Внутренний Статичный класс можно использовать как обычный класс, ссославшись на его местоположение
    // При этом можно не создавать объект внешнего класса
    String color;
    int doorCount;
    Engine engine;
    private static int a;

    public Car(String color, int doorCount, Engine engine) {

        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }
    void method() {
        System.out.println(Engine.countOfObjects); //обращение к static переменным через имя класса
        //System.out.println(Engine.HorsePower);  //НЕВОЗМОЖНО обращение к private non-static переменным через имя класса
        Engine e = new Engine(200); //нужно создать объект типа Engine (можно без указания класса, т.к он в этом класе где создан внутренний класс)
        System.out.println(e.HorsePower); // и обратиться через этот объект к private non-static переменным
    }

    @Override
    public String toString() {
        return "My Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    interface I{}

    public static class Engine {
        //Если вложенный static класс будет private, то создать объект в другом классе будет невозможно
        //вложенный static класс м.б. final, мы не сможем наследоваться от него
        // вложенный static класс м.б. abstract, мы не сможем создавать объекты, нужно extends этото класс и перезаписывать методы и создавать объект потомка внутреннего класса
        // вложенный static класс может extends другой класс class Engine Z
        // другие классы могут extends вложенный static класс class Z extends Car.Engine  (не внутри этого класса см ниже)
        //  static вложенный static класс может обращаться к private static элементам внешнего класса

        private int HorsePower; //non-static элемент
        static int countOfObjects; //static элемент
        //вложенный static класс может содежать static и non-static элементы
        @Override
        public String toString() {
            return "My Engine{" +
                    "HorsePower=" + HorsePower +
                    '}';
        }

        public Engine(int horsePower) {
            this.HorsePower = horsePower;
            countOfObjects++;
            System.out.println(a);
            //System.out.println(doorCount); //нельзя обратиться к non-static
        }
    }
}

class Test {
    public static void main(String[] args) {
       // Engine e = new Engine(256); //Создать как обычно нельзя, т.к. класс вложенный
        //Если вложенный static класс будет private, то создать объект в другом классе будет невозможно
        Car.Engine engine = new Car.Engine(256); // нужно указать перед элементом имя класса где находится Engine для static вложенных классов
        System.out.println(engine);
        Car car = new Car("red", 2, engine);
        System.out.println(car);
        //НЕЛЬЗЯ создать объект вложенного static класса к объекту внешнего класса
        //Car.Engine engine2 = new сar.Engine(150); // car объект внешнего класса

    }
}

class Z extends Car.Engine {
    Z(){super(200);}
}
