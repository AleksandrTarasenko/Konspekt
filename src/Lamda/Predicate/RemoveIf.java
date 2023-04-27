package Lamda.Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("privet");
        arrayList.add("poka");
        arrayList.add("ok");
        arrayList.add("Uchim Java");
        arrayList.add("A imenno lamdas");
        //arrayList.removeIf(element -> element.length() < 5); //короткая запись через лямда выражение
        Predicate<String> p = element -> element.length() < 5; //Длинная запись через Predicate и лямда выражение
        arrayList.removeIf(p);
        System.out.println(arrayList);

    }
}
