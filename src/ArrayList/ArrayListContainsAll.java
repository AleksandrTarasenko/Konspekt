package ArrayList;

import java.util.ArrayList;

public class ArrayListContainsAll {
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
//  \\containsAll//
//        Содержатся ли в листе 1 все элементы листа 2?
        boolean rezult = arrayList1.containsAll(arrayList2);
        System.out.println(rezult);//false(в листе 1 нет @@@)
    }
}
