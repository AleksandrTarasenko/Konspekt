package Collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {
//    Полиндром - слова и фразы читающиеся справа налево и наоборот. - МАДАМ
public static void main(String[] args) {
    String s = "madam";
    List<Character> list = new LinkedList<>();
//    Получаем Array массив символов с помощью метода toCharArray
    for (char ch : s.toCharArray()) {
        list.add(ch); //[m, a, d, a, m]
    }
    ListIterator<Character> iterator = list.listIterator(); //этот итератор начинает проверять с начала листа
    ListIterator<Character> reverseIterator = list.listIterator(list.size()); //это начинает проверять с конца листа
    boolean isPolindrom = true;
    while (iterator.hasNext() && reverseIterator.hasPrevious()) { //hasPrevious имеется ли предыдущий символ?
        if (iterator.next() != reverseIterator.previous()) { //previous Предыдущий символ
            isPolindrom = false;
            break;
        }
    }
    if (isPolindrom) {
        System.out.println("Polindrom");
    } else System.out.println("not Polindrom");
}
}
