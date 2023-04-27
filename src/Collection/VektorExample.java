package Collection;

import java.util.Vector;

public class VektorExample {
//    Vektor - устаревший тип Sinchronized класс
//    Использует многопоточность
//    В своей основе содержит массив элементов Object
//    НЕ РЕКОМЕНДОВАН к использованию
public static void main(String[] args) {
    Vector<String> vektor = new Vector<>();
    vektor.add("Aleksandr");
    vektor.add("Misha");
    vektor.add("Oleg");
    vektor.add("Katya");
    System.out.println(vektor);
//    \\firstElement()//
    //получение первого элемента Vektor
    System.out.println(vektor.firstElement());
    System.out.println(vektor.lastElement());
    vektor.remove(2);
    System.out.println(vektor);
    System.out.println(vektor.get(1));
    System.out.println(vektor);
}
}
