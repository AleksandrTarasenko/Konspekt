package ArrayList;

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Petr");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Kolya");
        arrayList1.add("Elena");
        System.out.println(arrayList1);
        Object[] array = arrayList1.toArray();
//  \\toArray//
//        Массив Object[] содержит все элементы arrayList1
//        Если нужен миссив типа String , то можно указать это конкретно через указание типа, а также в параметр указать размер массива
        String[] array2 = arrayList1.toArray(new String[5]); //часто используют [0] что бы не думать о размере массива
//        Если указать в парамете большее количество элементов, то они заполнятся null
//        Если указать меньше то программа свма создаст нужное количество до содержимого arrayList
//        через цикл for выводим элементы
        for (String s : array2) {
            System.out.println(s);
        }
    }
}
