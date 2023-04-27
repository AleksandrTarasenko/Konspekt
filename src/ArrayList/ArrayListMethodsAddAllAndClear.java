package ArrayList;

import java.util.ArrayList;

public class ArrayListMethodsAddAllAndClear {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("ok");
        list1.add("privet");
        list1.add("poka");
        list1.add("ogo");
        System.out.println(list1);
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("!!!");
        list2.add("???");
//  \\Метод addAll//
//  добавление листа в лист
        list1.addAll(list2); // Добавление листа 2 в конец листа 1
        System.out.println(list1);
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("@@@");
        list3.add("&&&");
        list1.add("ogo");
        list1.addAll(1, list3);//Добавление листа 3 на первую позицию листа 1,
                                    // остальные элементы сдвинутся в право на кол-во добавленных элементов
        System.out.println(list1);
//  \\Метод indexOf//
        System.out.println(list1.indexOf("ogo")); //ищет первое совпадение
//  \\Метод lastIndexOf//
        System.out.println(list1.lastIndexOf("ogo")); //ищет последнее совпадение
//  \\Метод contains//
//        Лист содержит элемент ogo?
        System.out.println(list1.contains("ogo")); // true если содержит
//  \\Метод Clear//
//  Очищение всего листа
        list1.clear();

//    \\Метод isEmpty//
//        Список пуст?
        System.out.println(list1.isEmpty()); //true если список пуст
    }
//    Так же есть метод toString который в ArrayList уже переопределен и его обычно не используют
}
