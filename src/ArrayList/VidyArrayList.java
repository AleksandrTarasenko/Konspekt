package ArrayList;

import java.util.ArrayList;
import java.util.List;

class VidyArrayList {
    //                     \\ArrayList//
//  В основе ArrayList лежит Object
// Вместимость ArrayList (Capacity) по умолчанию 10
// размер (size) по умолчанию "0",  размер (size) меняется от колличества помещенных объектов
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(); //первый вариант написания со <String> в конце (так обычно не пишут)
        ArrayList<String> list2 = new ArrayList<>(); //второй вариант написания <> (второй дженерик пустой)
        ArrayList<String> list3 = new ArrayList<>(30); //Третий вариант написания ArrayList<>(30), создаем ArrayList на 30 позиций,
        // что бы не загружать оперативную память на добавление элементов при превышении размера по умолчанию
        List<String> list4 = new ArrayList<>(); //четвертый вариант написания List<String>
        ArrayList<String> list5 = new ArrayList<>(list); //пятый вариант написания, добаление другого листа в параметры текущего ArrayList<String>(list)
        ArrayList list6 = new ArrayList(); //шестой вариант написания без дженериков, позволяет добавлять различные элементы (объект класса Car, String, Integer)

        list.add("ok");
        list.add("privet");
        list.add("poka");
//      list.add(50); // нельзя добавить числа в ArrayList<String>, для этого создается ArrayList<Integer>

    }
}
