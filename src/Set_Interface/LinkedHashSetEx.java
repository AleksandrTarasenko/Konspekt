package Set_Interface;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class LinkedHashSetEx {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        //элементы в LinkedHashSet хранятся в той последовательности что и были добавлены
        lhs.add(5);
        lhs.add(3);
        lhs.add(1);
        lhs.add(8);
        lhs.add(10);
        System.out.println(lhs);
    }
}
