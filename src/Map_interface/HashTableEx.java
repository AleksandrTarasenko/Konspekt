package Map_interface;

import java.util.Hashtable;

public class HashTableEx {
    public static void main(String[] args) {
        Hashtable<Double, Student2> ht = new Hashtable<>();
        //Устаревший класс поддерживающий многопоточность
        // в Hashtable НИ ключ НИ значение немогут быть null
        Student2 st1 = new Student2("Aleksandr", "Tarasenko", 4);
        Student2 st2 = new Student2("Mariya", "Ivanova", 1);
        Student2 st3 = new Student2("Sergey", "Petrov", 4);
        Student2 st4 = new Student2("Igor", "Sidorov", 2);
        ht.put(7.8, st1);
        ht.put(9.3, st2);
        ht.put(5.8, st3);
        ht.put(6.0, st4);
       // ht.put(null, st4); // в Hashtable НИ ключ НИ значение немогут быть null
       // ht.put(6.0, null); // в Hashtable НИ ключ НИ значение немогут быть null

        System.out.println(ht);
    }
}
