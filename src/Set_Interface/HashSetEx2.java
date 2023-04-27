package Set_Interface;

import java.util.HashSet;

import java.util.Set;

public class HashSetEx2 {
    public static void main(String[] args) {
        Set<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(5);
        hashSet1.add(2);
        hashSet1.add(3);
        hashSet1.add(1);
        hashSet1.add(8);

        Set<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(7);
        hashSet2.add(4);
        hashSet2.add(3);
        hashSet2.add(5);
        hashSet2.add(8);

//        union (объеденинение) AddAll происходит без дублирования
        Set<Integer> union = new HashSet<>(hashSet1); //новый лист может принимать в параметрах другой лис и будет его содержать
        union.addAll(hashSet2);
        System.out.println(union);

//         intersect (Пересечение) retainAll оставляет элементы которые пересекаются
        Set<Integer> intersect = new HashSet<>(hashSet1); //новый лист может принимать в параметрах другой лис и будет его содержать
        intersect.retainAll(hashSet2);
        System.out.println(intersect);

//        subtract (Разность) оставляет элементы которые не пересекаются
        Set<Integer> subtract = new HashSet<>(hashSet1); //новый лист может принимать в параметрах другой лис и будет его содержать
        subtract.removeAll(hashSet2);
        System.out.println(subtract);




    }
}
