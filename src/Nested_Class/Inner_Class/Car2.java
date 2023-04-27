package Nested_Class.Inner_Class;

public class Car2 {
     String color;
    int doorCount;
    Engine engine;


    public Car2 (String color, int doorCount) {
        //System.out.println(HorsePower); // не создав объект класса INNER во внешнем классе, мы не можем обратиться к переменной INNER класса
        Engine e = new Engine(200);
        System.out.println(e.HorsePower);
        this.color = color;
        this.doorCount = doorCount;
        //this.engine = this.new Engine(horsePower);
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }
   public  class Engine {
        //INNER сласс может содержать ТОЛЬКО non-static

        private int HorsePower; //non-static элемент
        public final static int b=5;//исключение final static может содержать
        @Override
        public String toString() {
            return "My Engine{" +
                    "HorsePower=" + HorsePower +
                    '}';
        }

        public Engine(int horsePower) {
            System.out.println(doorCount);//INNER класс может обращаться к private переменным внешнего класса
            this.HorsePower = horsePower;

        }
    }
}

class Test2 {
    public static void main(String[] args) {
        Car2 car = new Car2("black", 4);//Сначала создаем объект Внешнего класса
        Car2.Engine engine = car.new Engine(150); //Затем создаем объект engine c помощью объекта car Класса Car2
        car.setEngine(engine); //и получаем этот объект с помощью созданного в классе Car2 метода setEngine
        System.out.println(car);

        //МОЖНО
        Car2.Engine engine3 = new Car2("Yellow", 4) .new Engine(200);
        //теряется ссылка на Car2, и мы не знаем к какой машине этот engine3


        //НЕЛЬЗЯ
        //Car2.Engine engine = new car.Engine(150);
        //Car2.Engine engine = new Car.Engine(150);
    }
}


