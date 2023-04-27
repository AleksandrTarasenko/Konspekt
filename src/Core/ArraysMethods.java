package Core;

import java.util.Arrays;

public class ArraysMethods {
    //Метод Arrays.sort() выполняет сортировку массива.
    public class Main {
        public  void main(String[] args) {
            int[] numbers = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};
            Arrays.sort(numbers);
            System.out.println(Arrays.toString(numbers));
        }
    }

    //В метод Arrays.copyOf() мы передаем наш оригинальный массив, из которого надо скопировать значения, и длину нового массива, в который мы копируем данные. В данном случае в качестве длины мы указали numbers.length, так как хотим скопировать массив целиком.
    public class Main2 {
        public  void main(String[] args) {
            int[] numbers = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};
            int [] numbersCopy = Arrays.copyOf(numbers, numbers.length);
            System.out.println(Arrays.toString(numbersCopy));
        }
    }
    //Arrays.toString - возвращает массив в читабельном виде
    public static void printArray(int[] numbers) {
        String s = Arrays.toString(numbers);
        System.out.println(s);
    }
    //Середина массива через Arrays.copyOfRange
    public static int[] getArrayMiddle(int[] numbers) {
        int[] rezult;
        if (numbers.length == 0) {
            return numbers;
        } else if (numbers.length % 2 == 0) {
            rezult = Arrays.copyOfRange(numbers, numbers.length / 2 - 1, numbers.length / 2 + 1);
            return rezult;
        } else {
            rezult = Arrays.copyOfRange(numbers, numbers.length / 2, numbers.length / 2 + 1);
            return rezult;
        }
    }
    //  System.arraycopy объединение массива и сортировка
    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] rezult = new int[firstArray.length + secondArray.length];
        rezult = Arrays.copyOf(firstArray, rezult.length);
        System.arraycopy(secondArray, 0, rezult, firstArray.length, secondArray.length);
        Arrays.sort(rezult);
        System.out.println(Arrays.toString(rezult));
        return rezult;
    }
}
