package Stream;

import java.util.*;
import java.util.stream.Collectors;

public class mapEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela?");
        list.add("OK");
        list.add("poka");

//        for (int i = 0; i < list.size(); i++) {
//            list.set(i,String.valueOf(list.get(i).length())); //получить String из int через valueOf
//      //  }
//  \\stream// принимает в себя все данные ArrayList (массива) в виде потока и передает их в необходимый метод
//
//  \\Метод map//
        //map обрабатывает входящий поток от stream через условие в его параметрах, через лямда выражения
        List<Integer> list2 = list.stream().map(element -> element.length())
                .collect(Collectors.toList());
                //к каждому элементу (element) полученного от потока stream, применяем условие изменения (element.length())
        // map имеет структуру интерфейса Function и может принимать один параметр <String> а возвращать другой <Integer>
        //Метод map возвращает stream, его нельзя напрямую передать в новый list, используем метод collect
        //Все методы stream НЕ ИЗМЕНЯЮТ коллекции
        System.out.println(list2);
        int[] array = {5, 9, 3, 8, 1};
        array = Arrays.stream(array).map(element
                ->{
            if (element % 3 == 0) {
                element = element / 3;
            }
            return element;
        }).toArray();  // toArray преобразование потока в массив
        System.out.println(Arrays.toString(array));

        Set<String> set = new TreeSet<>();
        set.add("privet");
        set.add("kak dela?");
        set.add("OK");
        set.add("poka");
        System.out.println(set);
        Set<Integer> set2 = set.stream().map(e -> e.length()).collect(Collectors.toSet());
        List<Integer> list3 = set.stream().map(e -> e.length()).collect(Collectors.toList());
        //stream можно передать в любой тип данных (List, Set, Массив, ArrayList)
        System.out.println(set2);
    }
}
