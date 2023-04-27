package ArrayList;

import java.util.ArrayList;

public class ArrayListRetainAll {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("ok");
        arrayList1.add("privet");
        arrayList1.add("poka");
        arrayList1.add("ogo");
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("@@@");
        arrayList2.add("ok");
        arrayList2.add("ogo");
//  \\retainAll//
//        Удаление из листа 1 элементов не содержащихся в листе 2.
//        В листе 1 остаются элементы содержащиеся толко в листе 2
        arrayList1.retainAll(arrayList2);
        System.out.println(arrayList1);
    }
}
