package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-3);
        arrayList.add(8);
        arrayList.add(12);
        arrayList.add(-8);
        arrayList.add(0);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(1);
        arrayList.add(150);
        arrayList.add(-30);
        arrayList.add(19);
        System.out.println(arrayList ); //не отсортированный массив [-3, 8, 12, -8, 0, 5, 10, 1, 150, -30, 19]
//  \\ Collections.sort// Сортировка коллекции
        Collections.sort(arrayList);
        System.out.println(arrayList ); //отсортированный массив методом Collections.sort [-30, -8, -3, 0, 1, 5, 8, 10, 12, 19, 150]
        int index1 = Collections.binarySearch(arrayList, 12);//ищем значение 12 в отсортировоном списке
        System.out.println(index1);//ввод на экран номер индекса значения 12
//  \\binarySearch//
//  по средством деления отсортированного списка на 2 части сравнивает с искомым значением в какой половине он находится
//  тк делает пока не найдет искомое значение. в списке из 80 000 значений, найдет за 13 итераций
//  Если значение отрицательное, то вывод будет отрицательным, что говорит об отсутствии значения в массиве


    }


}
