package Nested_Class.Inner_Class;

public class Car {
     String color;
    int doorCount;
    Engine engine;


    public Car(String color, int doorCount, int horsePower) {

        this.color = color;
        this.doorCount = doorCount;
        this.engine = this.new Engine(horsePower); //создаем новый объект внутреннего(INNER) класса Engine
                                                   // с параметром horsePower с this.(текущий объект engine)
          //INNER класс всегда завязан на своем внешнем классе, и для создания объекта INNER, ВСЕГДА нужно создать объект INNER класса
    }
//    void method() {
//        System.out.println(Engine.countOfObjects); //обращение к static переменным через имя класса
//        //System.out.println(Engine.HorsePower);  //НЕВОЗМОЖНО обращение к private non-static переменным через имя класса
//        Engine e = new Engine(200); //нужно создать объект типа Engine (можно без указания класса, т.к он в этом класе где создан внутренний класс)
//        System.out.println(e.HorsePower); // и обратиться через этот объект к private non-static переменным
//    }

    @Override
    public String toString() {
        return "My Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }



    public  class Engine {

        private int HorsePower; //non-static элемент

        @Override
        public String toString() {
            return "My Engine{" +
                    "HorsePower=" + HorsePower +
                    '}';
        }

        public Engine(int horsePower) {
            this.HorsePower = horsePower;

        }
    }
}

class Test {
    public static void main(String[] args) {
        Car car = new Car("black", 4, 300);
        System.out.println(car);
           // Car.Engine engine = new Car.Engine(256);
        // в нутри main engine не создаем


    }
}


