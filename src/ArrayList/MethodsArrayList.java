package ArrayList;

import java.util.ArrayList;

public class MethodsArrayList {
//  \\метод add//
//    - добавляет элементы в лист через параметры list.add("ok")
//    или list.add( 2,"ok") если нужно добавить позицию в определенный индекс(индекс 2 - add("poka");)
//    если указанный индекс не рядом с последним элементом, выбросится ошибка Core.Exception
//    нельзя добавлять в ArrayList примитивные типы данных (int), Можно его старший класс Integer
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Содержание листа добавленного командой add и выведен через цикл for-each");
        list.add("ok");
        list.add("privet");
        list.add("poka");
        list.add("ogo");
//  Вывод ArrayList в консоль через for-each loop(цикл)
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println(); //перенос строки состояния исполнения файла (для красивого вида (данные отдельно от строки состояния исполнения файла))
//  \\Метод get//
//      получает элемент ArrayList по его индексу list.get(1)
        System.out.println("получен элемент по методу get");
        System.out.println(list.get(1));
        System.out.println("");
//        можно вывести все элементы ArrayList через цикл
        System.out.println("Содержание листа выведенного через цикл for");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

//  \\Метод set//
//      работает как метод replase, т.е. заменяет элемент по № индекса на элемент переданный в параметре индекса
        System.out.println("содержание листа после замены элемента методом set");
        list.set(0, "be-be"); //Заменяем "0" элемент листа с "ок" на "be-be"
        System.out.println(list);

//  \\Метод remove//
//        Удаление элемента по index, вернется имя элемента
        list.remove(1);
//        или сам элемент (вернется Boolean (true-если элемент найден и удален, false-если не найден))
        list.remove("poka");
//        При удалении элемента, все элементы следующие за ним смещаются влево и их индекс изменяется
//        нельзя идти на поводу у детей
//        нельзя удалить элемент бОльший чем size
        System.out.println("содержание листа после удаления двух элементов методом remove");
        System.out.println(list);

    }
//

}
