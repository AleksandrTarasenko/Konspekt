package Set_Interface;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Aleksandr");
        set.add("Oleg");
        set.add("Marina");
        set.add("Igor");
        //set.add(null); Можно использовать null
        set.add("Igor"); //HashSet не поддерживает множество и дубликат не будет добавлн
        System.out.println(set);
        set.remove("Marina");
        System.out.println(set.size()); //сколько знач в HashSet
        set.isEmpty(); // Пустой ли список
        set.contains("Aleksandr"); // Содержится ли элемент "Aleksandr"
        //В методе set нет метода get

        for (String s : set) {
            System.out.println(s);
        }

    }
}
