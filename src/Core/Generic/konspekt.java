package Core.Generic;

import java.util.ArrayList;

class Konspekt {
    //Дженерики (Core.Generic) используют для параметризации класса или метода,
    // если неизвестно какие будут данные или данные разного формата.
    //Стандартное буквенное обозначение Дженериков (placeholder type заполнитель типа)
    // T - Type - тип
    // E - Elements - Элементы
    // K - Key - Ключи
    // V - Value - Значения
}

class Info<T> { //параметризированный класс. <T> явл параметром без указания типа данных
    private T value; // не может быть static

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "[{" + value + "}]"; // в качестве примера выводим инфо из value в красивых скобках
    }

    public T getValue() {
        return value;
    }


    public class ParametrizirovanniyClass {
        public  void main(String[] args) {
            Info<String> info1 = new Info<>("Привет"); //здесь <String> передается в T , "Привет" передается в value (строка 17)
            System.out.println(info1);
            // в параметры мы передали <String>, значит параметр данных в классе Info<T> будет вести себя как <String>,
            Info<Integer> info2 = new Info<>(10); //здесь <String> передается в T , "Привет" передается в value (строка 17)
            System.out.println(info2);
            // если мы передадим <Integer>, то как <Integer>
        }

    }
}
class Pair<V1, V2> { //Можнол использовать  2 пераметра в классе
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    public V1 getFirstValue() {
        return value1;
    }
    public V2 getSecondValue() {
        return value2;
    }
    public static void main(String[] args) {
        Pair <String ,Integer> pair1= new Pair<>("hello", 20);
        Pair <Integer ,Double> pair2= new Pair<>(25, 20.2);
    }
}
class OtherPair<V> { //Можно создать класс с одним пераметром,
    // при этом в конструкторе указать 2 значения этого парамера
    //объект будет создан с двумя параметрами одного типа
    private V value1;
    private V value2;

    public OtherPair(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    public V getFirstValue() {
        return value1;
    }
    public V getSecondValue() {
        return value2;
    }
    public static void main(String[] args) {
        Pair <String ,String> pair1= new Pair<>("hello", "hello");
        Pair <Integer ,Integer> pair2= new Pair<>(25, 20);
    }
}
class GenericMethods { // класс для параметризированного метода
    // Если мы хотим ограничить ArrayList только занчениями из класса например Number (Числа)
    //то необходимо его <T extends Number>
    //так же он может имплементировать интерфейсы (см ниже),
    //написание следующее <T extends Number&i1&i2> (extends & имена интерфейсов через &)
    // при этом классы должны имплементировать интерфейсы
    public static <T> T getSecondElements(ArrayList<T> aL) { // Параметризированный метод
        return aL.get(1);
    }
    //<T>  явл типом дженерик и в него подставляется тип <Integer> из строки 46 ArrayList<Integer> aL1 = new ArrayList<>();
    // Т явл return типом данного метода, в данном случае <Integer>


    public static void main(String[] args) {

        ArrayList<Integer> aL1 = new ArrayList<>(); // создаем ArrayList с типом <Integer>. Так же можно со <String>
        aL1.add(10); // если String то вносим текст в кавычках aL1.add("Привет");
        aL1.add(50);
        aL1.add(23);
        int a = GenericMethods.getSecondElements(aL1);  // если String то запись String s = GenericMethods.getSecondElements(aL1);
        System.out.println(a);

    }

    interface i1 {

    }

    interface i2 {

    }

    //Тема стирание типов
    class Info2<T> { //параметризированный класс. <T> явл параметром без указания типа данных
        private T value; // не может быть static

        public Info2(T value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "[{" + value + "}]"; // в качестве примера выводим инфо из value в красивых скобках
        }

        public T getValue() {
            return value;
        }


        public class ParametrizirovanniyClass {
            public  void main(String[] args) {

            } //данные 2 метода ниже, не могут работать одновременно с Дженериком
            // т.к. JVM не понимает с каким типом данных она работает
            //она видит abc (Info info) без <String> и <Integer>

            //            public void abc (Info <String> info) {
//                String s = info.getValue();
//            }
            public void abc(Info<Integer> info) {
                Integer i = info.getValue();
            }
        }

        class Parent { //Нельзя оверайдить класс с другим параметром <String> к <Integer>
            public void abc(Info<String> info) {
                String s = info.getValue();
            }
//            class Child extends Parent {
//                public void abc(Info<Integer> info) {
//                    Integer i = info.getValue();
                }
        }
    }

