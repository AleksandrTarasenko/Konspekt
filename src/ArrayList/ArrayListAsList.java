package ArrayList;

import java.util.Arrays;
import java.util.List;

public class ArrayListAsList {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");
        StringBuilder[] array = {sb1, sb2, sb3, sb4};
        List<StringBuilder> list = Arrays.asList(array);
//  \\Arrays.asList//
//        Получение листа из массива
//        Длина list не может быть изменена, оана полностью связана с массивом array
//        При изменениии элемента массива или содержании массива, все изменения отразятся в list
        array[0].append("!!!");
    }
}
