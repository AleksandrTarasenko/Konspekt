package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSubList {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Petr");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Kolya");
        arrayList1.add("Elena");
        System.out.println(arrayList1);
//  \\subList//
//    Создание List из ArrayList
        List<String> myList = arrayList1.subList(1, 4);
//        Последний элемент параметра subList(1, 4) не включается в список и заносится все данные до него
//        subList не является отдельной структурой, он явл его представленнием
//        Если добавить элементы в subList, то они добавятся в arrayList1
        myList.add("Fedor");
        System.out.println(myList);
        System.out.println(arrayList1);
//        Нельзя добавить элементы в arrayList1 если используется его представление через subList
//        При попытке создания будет выброшено исключение
    }
}
