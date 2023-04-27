package Generic;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {
    public static void main(String[] args) {
        List<?> list = new ArrayList<Integer>();
        //добавить через команду list.add в List<?> нельзя, т.к.<?> это неизвестный тип
        //можно использовать в методе см метод showListInfo ниже
        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.16);
        showListInfo(list1);
        List<String> list2 = new ArrayList<>();
        list2.add("OK");
        list2.add("Privet");
        list2.add("Poka");
        showListInfo(list2);
        ArrayList<Double> ald = new ArrayList<>();
        ald.add(3.14);
        ald.add(3.15);
        ald.add(3.16);
        System.out.println(summ(ald));
     }
    static void showListInfo(List<?> list) { //параметр <?> позволяет получить в свой метод любой ArrayList <Integer>, <Double>, <String>
        System.out.println("moy list soderjit element" + list);
    }
    //boundid wildcards (ограничивать сверху или снизу) указывая родительский класс к примеру Number у Double и Integer см пример ниже
    //ограничение снизу <? extends Number>
    List<? extends Number> list4 = new ArrayList<Integer>();

    public static Double summ (ArrayList<? extends  Number> al) {
        double summ = 0;
        for (Number n : al) {
            summ += n.doubleValue();
        }
        return summ;
    }
    //ограничение сверху <? extends Number>, т.е класс Number и выше его, но не ниже
    List<? super Number> list5 = new ArrayList<Number>();
}
