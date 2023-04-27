package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("ok");
        arrayList.add("privet");
        arrayList.add("poka");
        arrayList.add("ogo");
//  \\Iterator// - Это повторитель
        Iterator<String> iterator = arrayList.iterator();
//  Вывод элементов с помощью Iterator
        while (iterator.hasNext()) { // iterator с помощью команды .hasNext() проверяет Есть ли еще элемент,
            System.out.println(iterator.next()); //если true, то выводи с помощью команды .next() этот элемент
//  Удаление элементов с помощью iterator из коллекции ArrayList
        iterator.next();
        iterator.remove(); //НЕЛЬЗЯ удалить элемент не получив его с помощью команды iterator.next(),
//      Если его не спользовать, будет выброшенно исключение IllegalStateException
//      оператор hasNext() только проверяет есть ли следующий элемент или нет.

        }

    }
}
