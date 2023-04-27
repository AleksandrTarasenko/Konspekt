package Collection;

import java.util.Arrays;
import java.util.Collection;

public class BinarySearchArrays {
    public static void main(String[] args) {
        int[] array = {-3, 8, 12, -8, 0, 5, 10, 1, 150, -30, 19};
//  \\Arrays.toString(имяМассива)// //  Вывод массива на экран

        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
//  \\Arrays.binarySearch(array, 150); // Поиск элемента по значению в массиве
        int index = Arrays.binarySearch(array, 150);
        System.out.println(index);

    }

}
