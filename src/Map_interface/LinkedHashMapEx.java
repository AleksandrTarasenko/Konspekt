package Map_interface;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student2> linkedHashMap = new LinkedHashMap(16, 0.75f, true);
        //можно указать в параметрах 3 значения Capacity, loadFactor, accessOrder (последовательность хранения))
        //accessOrder (false - по умолчанию) (true - последний использованный элемент, переносится в конец списка)
        Student2 st1 = new Student2("Aleksandr", "Tarasenko", 4);
        Student2 st2 = new Student2("Mariya", "Ivanova", 1);
        Student2 st3 = new Student2("Sergey", "Petrov", 4);
        Student2 st4 = new Student2("Igor", "Sidorov", 2);

        // LinkedHashMap в каком порядке добавили в том и хранятся значения,
        // Как в LinkedList, LinkedHashMap хранит ссыки на предыдущий и последующий элемент
        linkedHashMap.put(7.2, st3);
        linkedHashMap.put(7.5, st4);
        linkedHashMap.put(5.8, st1);
        linkedHashMap.put(6.4, st2);

        System.out.println(linkedHashMap);

        System.out.println(linkedHashMap.get(5.8));
        System.out.println(linkedHashMap.get(7.5));

        System.out.println(linkedHashMap);
    }
}
